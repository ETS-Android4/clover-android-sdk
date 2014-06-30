/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.pay;

@SuppressWarnings("all")
public final class PaymentRequest implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractId();
      }
    },
    orderId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractOrderId();
      }
    },
    timestamp {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractTimestamp();
      }
    },
    tender {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractTender();
      }
    },
    amount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractAmount();
      }
    },
    tipAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractTipAmount();
      }
    },
    taxAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractTaxAmount();
      }
    },
    cashTendered {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractCashTendered();
      }
    },
    employeeId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractEmployeeId();
      }
    },
    employeeName {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractEmployeeName();
      }
    },
    authorizationCode {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractAuthorizationCode();
      }
    },
    externalPaymentId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractExternalPaymentId();
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractServiceChargeAmount();
      }
    },
    taxableAmountRates {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractTaxableAmountRates();
      }
    },
    lineItems {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractLineItems();
      }
    },
    card {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.extractCard();
      }
    },
    ;

    public abstract Object extractValue(PaymentRequest instance);
  }

  private String jsonString = null;
  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public PaymentRequest() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentRequest(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PaymentRequest(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentRequest(PaymentRequest src) {
    if (src.jsonString != null) {
      this.jsonString = src.jsonString;
    } else {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = new org.json.JSONObject(jsonString);
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) throw new IllegalArgumentException("Maximum string length exceeded for 'id'");

    java.lang.String orderId = getOrderId();
    if (orderId != null && orderId.length() > 13) throw new IllegalArgumentException("Maximum string length exceeded for 'orderId'");

    java.lang.String employeeId = getEmployeeId();
    if (employeeId != null && employeeId.length() > 13) throw new IllegalArgumentException("Maximum string length exceeded for 'employeeId'");

    java.lang.String employeeName = getEmployeeName();
    if (employeeName != null && employeeName.length() > 127) throw new IllegalArgumentException("Maximum string length exceeded for 'employeeName'");

    java.lang.String externalPaymentId = getExternalPaymentId();
    if (externalPaymentId != null && externalPaymentId.length() > 32) throw new IllegalArgumentException("Maximum string length exceeded for 'externalPaymentId'");
  }


  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }

  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }

  /**
   * Unique identifier of the order with which this payment is associated
   */
  public java.lang.String getOrderId() {
    return cacheGet(CacheKey.orderId);
  }

  private java.lang.String extractOrderId() {
    return getJSONObject().isNull("orderId") ? null :
      getJSONObject().optString("orderId");
  }

  /**
   * Request timestamp
   */
  public java.lang.Long getTimestamp() {
    return cacheGet(CacheKey.timestamp);
  }

  private java.lang.Long extractTimestamp() {
    return getJSONObject().isNull("timestamp") ? null :
      getJSONObject().optLong("timestamp");
  }

  /**
   * The tender type associated with this payment, e.g. credit card, cash, etc.
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.base.Tender getTender() {
    return cacheGet(CacheKey.tender);
  }

  private com.clover.sdk.v3.base.Tender extractTender() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("tender");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Tender(getJSONObject().optJSONObject("tender"));
    }
    return null;
  }

  /**
   * Total amount paid
   */
  public java.lang.Long getAmount() {
    return cacheGet(CacheKey.amount);
  }

  private java.lang.Long extractAmount() {
    return getJSONObject().isNull("amount") ? null :
      getJSONObject().optLong("amount");
  }

  /**
   * Amount paid in tips
   */
  public java.lang.Long getTipAmount() {
    return cacheGet(CacheKey.tipAmount);
  }

  private java.lang.Long extractTipAmount() {
    return getJSONObject().isNull("tipAmount") ? null :
      getJSONObject().optLong("tipAmount");
  }

  /**
   * Amount paid in tax (TBD: sales tax only?)
   */
  public java.lang.Long getTaxAmount() {
    return cacheGet(CacheKey.taxAmount);
  }

  private java.lang.Long extractTaxAmount() {
    return getJSONObject().isNull("taxAmount") ? null :
      getJSONObject().optLong("taxAmount");
  }

  /**
   * Cash tendered
   */
  public java.lang.Long getCashTendered() {
    return cacheGet(CacheKey.cashTendered);
  }

  private java.lang.Long extractCashTendered() {
    return getJSONObject().isNull("cashTendered") ? null :
      getJSONObject().optLong("cashTendered");
  }

  /**
   * Employee ID
   */
  public java.lang.String getEmployeeId() {
    return cacheGet(CacheKey.employeeId);
  }

  private java.lang.String extractEmployeeId() {
    return getJSONObject().isNull("employeeId") ? null :
      getJSONObject().optString("employeeId");
  }

  /**
   * Employee name
   */
  public java.lang.String getEmployeeName() {
    return cacheGet(CacheKey.employeeName);
  }

  private java.lang.String extractEmployeeName() {
    return getJSONObject().isNull("employeeName") ? null :
      getJSONObject().optString("employeeName");
  }

  /**
   * Used for voice authorization for credit cards
   */
  public java.lang.String getAuthorizationCode() {
    return cacheGet(CacheKey.authorizationCode);
  }

  private java.lang.String extractAuthorizationCode() {
    return getJSONObject().isNull("authorizationCode") ? null :
      getJSONObject().optString("authorizationCode");
  }

  /**
   * External payment ID when using custom tender
   */
  public java.lang.String getExternalPaymentId() {
    return cacheGet(CacheKey.externalPaymentId);
  }

  private java.lang.String extractExternalPaymentId() {
    return getJSONObject().isNull("externalPaymentId") ? null :
      getJSONObject().optString("externalPaymentId");
  }

  /**
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.payments.ServiceChargeAmount getServiceChargeAmount() {
    return cacheGet(CacheKey.serviceChargeAmount);
  }

  private com.clover.sdk.v3.payments.ServiceChargeAmount extractServiceChargeAmount() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("serviceChargeAmount");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.payments.ServiceChargeAmount(getJSONObject().optJSONObject("serviceChargeAmount"));
    }
    return null;
  }

  /**
   *
   * The returned List is unmodifiable and will never contain any nulls, even if the source JSON had null entries.
   */
  public java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> getTaxableAmountRates() {
    return cacheGet(CacheKey.taxableAmountRates);
  }

  private java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> extractTaxableAmountRates() {
    if (getJSONObject().isNull("taxableAmountRates")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("taxableAmountRates");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.payments.TaxableAmountRate>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.payments.TaxableAmountRate item = new com.clover.sdk.v3.payments.TaxableAmountRate(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }

  /**
   * Payments that were made for this line item
   *
   * The returned List is unmodifiable and will never contain any nulls, even if the source JSON had null entries.
   */
  public java.util.List<com.clover.sdk.v3.payments.LineItemPayment> getLineItems() {
    return cacheGet(CacheKey.lineItems);
  }

  private java.util.List<com.clover.sdk.v3.payments.LineItemPayment> extractLineItems() {
    if (getJSONObject().isNull("lineItems")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("lineItems");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.payments.LineItemPayment> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.payments.LineItemPayment>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.payments.LineItemPayment item = new com.clover.sdk.v3.payments.LineItemPayment(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }

  /**
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.pay.PaymentRequestCardDetails getCard() {
    return cacheGet(CacheKey.card);
  }

  private com.clover.sdk.v3.pay.PaymentRequestCardDetails extractCard() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("card");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.pay.PaymentRequestCardDetails(getJSONObject().optJSONObject("card"));
    }
    return null;
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'timestamp' field is set and is not null */
  public boolean isNotNullTimestamp() {
    return cacheValueIsNotNull(CacheKey.timestamp);
  }

  /** Checks whether the 'tender' field is set and is not null */
  public boolean isNotNullTender() {
    return cacheValueIsNotNull(CacheKey.tender);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'cashTendered' field is set and is not null */
  public boolean isNotNullCashTendered() {
    return cacheValueIsNotNull(CacheKey.cashTendered);
  }

  /** Checks whether the 'employeeId' field is set and is not null */
  public boolean isNotNullEmployeeId() {
    return cacheValueIsNotNull(CacheKey.employeeId);
  }

  /** Checks whether the 'employeeName' field is set and is not null */
  public boolean isNotNullEmployeeName() {
    return cacheValueIsNotNull(CacheKey.employeeName);
  }

  /** Checks whether the 'authorizationCode' field is set and is not null */
  public boolean isNotNullAuthorizationCode() {
    return cacheValueIsNotNull(CacheKey.authorizationCode);
  }

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null */
  public boolean isNotNullTaxableAmountRates() {
    return cacheValueIsNotNull(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxableAmountRates() {
    return isNotNullTaxableAmountRates() && !getTaxableAmountRates().isEmpty();
  }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() {
    return isNotNullLineItems() && !getLineItems().isEmpty();
  }

  /** Checks whether the 'card' field is set and is not null */
  public boolean isNotNullCard() {
    return cacheValueIsNotNull(CacheKey.card);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'timestamp' field has been set, however the value could be null */
  public boolean hasTimestamp() {
    return cacheHasKey(CacheKey.timestamp);
  }

  /** Checks whether the 'tender' field has been set, however the value could be null */
  public boolean hasTender() {
    return cacheHasKey(CacheKey.tender);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'cashTendered' field has been set, however the value could be null */
  public boolean hasCashTendered() {
    return cacheHasKey(CacheKey.cashTendered);
  }

  /** Checks whether the 'employeeId' field has been set, however the value could be null */
  public boolean hasEmployeeId() {
    return cacheHasKey(CacheKey.employeeId);
  }

  /** Checks whether the 'employeeName' field has been set, however the value could be null */
  public boolean hasEmployeeName() {
    return cacheHasKey(CacheKey.employeeName);
  }

  /** Checks whether the 'authorizationCode' field has been set, however the value could be null */
  public boolean hasAuthorizationCode() {
    return cacheHasKey(CacheKey.authorizationCode);
  }

  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field has been set, however the value could be null */
  public boolean hasTaxableAmountRates() {
    return cacheHasKey(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'card' field has been set, however the value could be null */
  public boolean hasCard() {
    return cacheHasKey(CacheKey.card);
  }


  /**
   * Sets the field 'id'.
   */
  public PaymentRequest setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'orderId'.
   */
  public PaymentRequest setOrderId(java.lang.String orderId) {
    logChange("orderId");

    try {
      getJSONObject().put("orderId", orderId == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(orderId));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.orderId);
    return this;
  }

  /**
   * Sets the field 'timestamp'.
   */
  public PaymentRequest setTimestamp(java.lang.Long timestamp) {
    logChange("timestamp");

    try {
      getJSONObject().put("timestamp", timestamp == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(timestamp));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.timestamp);
    return this;
  }

  /**
   * Sets the field 'tender'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setTender(com.clover.sdk.v3.base.Tender tender) {
    logChange("tender");

    try {
      getJSONObject().put("tender",
          tender == null ? org.json.JSONObject.NULL : tender.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.tender);
    return this;
  }

  /**
   * Sets the field 'amount'.
   */
  public PaymentRequest setAmount(java.lang.Long amount) {
    logChange("amount");

    try {
      getJSONObject().put("amount", amount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(amount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.amount);
    return this;
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public PaymentRequest setTipAmount(java.lang.Long tipAmount) {
    logChange("tipAmount");

    try {
      getJSONObject().put("tipAmount", tipAmount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(tipAmount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.tipAmount);
    return this;
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public PaymentRequest setTaxAmount(java.lang.Long taxAmount) {
    logChange("taxAmount");

    try {
      getJSONObject().put("taxAmount", taxAmount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(taxAmount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.taxAmount);
    return this;
  }

  /**
   * Sets the field 'cashTendered'.
   */
  public PaymentRequest setCashTendered(java.lang.Long cashTendered) {
    logChange("cashTendered");

    try {
      getJSONObject().put("cashTendered", cashTendered == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(cashTendered));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.cashTendered);
    return this;
  }

  /**
   * Sets the field 'employeeId'.
   */
  public PaymentRequest setEmployeeId(java.lang.String employeeId) {
    logChange("employeeId");

    try {
      getJSONObject().put("employeeId", employeeId == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(employeeId));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.employeeId);
    return this;
  }

  /**
   * Sets the field 'employeeName'.
   */
  public PaymentRequest setEmployeeName(java.lang.String employeeName) {
    logChange("employeeName");

    try {
      getJSONObject().put("employeeName", employeeName == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(employeeName));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.employeeName);
    return this;
  }

  /**
   * Sets the field 'authorizationCode'.
   */
  public PaymentRequest setAuthorizationCode(java.lang.String authorizationCode) {
    logChange("authorizationCode");

    try {
      getJSONObject().put("authorizationCode", authorizationCode == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(authorizationCode));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.authorizationCode);
    return this;
  }

  /**
   * Sets the field 'externalPaymentId'.
   */
  public PaymentRequest setExternalPaymentId(java.lang.String externalPaymentId) {
    logChange("externalPaymentId");

    try {
      getJSONObject().put("externalPaymentId", externalPaymentId == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(externalPaymentId));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.externalPaymentId);
    return this;
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setServiceChargeAmount(com.clover.sdk.v3.payments.ServiceChargeAmount serviceChargeAmount) {
    logChange("serviceChargeAmount");

    try {
      getJSONObject().put("serviceChargeAmount",
          serviceChargeAmount == null ? org.json.JSONObject.NULL : serviceChargeAmount.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.serviceChargeAmount);
    return this;
  }

  /**
   * Sets the field 'taxableAmountRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentRequest setTaxableAmountRates(java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> taxableAmountRates) {
    logChange("taxableAmountRates");

    try {
      if (taxableAmountRates == null) {
        getJSONObject().put("taxableAmountRates", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.taxableAmountRates);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.payments.TaxableAmountRate obj : taxableAmountRates) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("taxableAmountRates", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.taxableAmountRates);
    return this;
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentRequest setLineItems(java.util.List<com.clover.sdk.v3.payments.LineItemPayment> lineItems) {
    logChange("lineItems");

    try {
      if (lineItems == null) {
        getJSONObject().put("lineItems", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.lineItems);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.payments.LineItemPayment obj : lineItems) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("lineItems", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.lineItems);
    return this;
  }

  /**
   * Sets the field 'card'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setCard(com.clover.sdk.v3.pay.PaymentRequestCardDetails card) {
    logChange("card");

    try {
      getJSONObject().put("card",
          card == null ? org.json.JSONObject.NULL : card.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.card);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    unlogChange("orderId");
    getJSONObject().remove("orderId");
    cacheRemoveValue(CacheKey.orderId);
  }

  /** Clears the 'timestamp' field, the 'has' method for this field will now return false */
  public void clearTimestamp() {
    unlogChange("timestamp");
    getJSONObject().remove("timestamp");
    cacheRemoveValue(CacheKey.timestamp);
  }

  /** Clears the 'tender' field, the 'has' method for this field will now return false */
  public void clearTender() {
    unlogChange("tender");
    getJSONObject().remove("tender");
    cacheRemoveValue(CacheKey.tender);
  }

  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    unlogChange("amount");
    getJSONObject().remove("amount");
    cacheRemoveValue(CacheKey.amount);
  }

  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    unlogChange("tipAmount");
    getJSONObject().remove("tipAmount");
    cacheRemoveValue(CacheKey.tipAmount);
  }

  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    unlogChange("taxAmount");
    getJSONObject().remove("taxAmount");
    cacheRemoveValue(CacheKey.taxAmount);
  }

  /** Clears the 'cashTendered' field, the 'has' method for this field will now return false */
  public void clearCashTendered() {
    unlogChange("cashTendered");
    getJSONObject().remove("cashTendered");
    cacheRemoveValue(CacheKey.cashTendered);
  }

  /** Clears the 'employeeId' field, the 'has' method for this field will now return false */
  public void clearEmployeeId() {
    unlogChange("employeeId");
    getJSONObject().remove("employeeId");
    cacheRemoveValue(CacheKey.employeeId);
  }

  /** Clears the 'employeeName' field, the 'has' method for this field will now return false */
  public void clearEmployeeName() {
    unlogChange("employeeName");
    getJSONObject().remove("employeeName");
    cacheRemoveValue(CacheKey.employeeName);
  }

  /** Clears the 'authorizationCode' field, the 'has' method for this field will now return false */
  public void clearAuthorizationCode() {
    unlogChange("authorizationCode");
    getJSONObject().remove("authorizationCode");
    cacheRemoveValue(CacheKey.authorizationCode);
  }

  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    unlogChange("externalPaymentId");
    getJSONObject().remove("externalPaymentId");
    cacheRemoveValue(CacheKey.externalPaymentId);
  }

  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    unlogChange("serviceChargeAmount");
    getJSONObject().remove("serviceChargeAmount");
    cacheRemoveValue(CacheKey.serviceChargeAmount);
  }

  /** Clears the 'taxableAmountRates' field, the 'has' method for this field will now return false */
  public void clearTaxableAmountRates() {
    unlogChange("taxableAmountRates");
    getJSONObject().remove("taxableAmountRates");
    cacheRemoveValue(CacheKey.taxableAmountRates);
  }

  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    unlogChange("lineItems");
    getJSONObject().remove("lineItems");
    cacheRemoveValue(CacheKey.lineItems);
  }

  /** Clears the 'card' field, the 'has' method for this field will now return false */
  public void clearCard() {
    unlogChange("card");
    getJSONObject().remove("card");
    cacheRemoveValue(CacheKey.card);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PaymentRequest copyChanges() {
    PaymentRequest copy = new PaymentRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentRequest src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new PaymentRequest(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = jsonString != null ? jsonString : getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "PaymentRequest{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<PaymentRequest> CREATOR = new android.os.Parcelable.Creator<PaymentRequest>() {
    @Override
    public PaymentRequest createFromParcel(android.os.Parcel in) {
      PaymentRequest instance = new PaymentRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public PaymentRequest[] newArray(int size) {
      return new PaymentRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentRequest>() {
    @Override
    public PaymentRequest create(org.json.JSONObject jsonObject) {
      return new PaymentRequest(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;

    public static final boolean TIMESTAMP_IS_REQUIRED = false;

    public static final boolean TENDER_IS_REQUIRED = false;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TIPAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

    public static final boolean CASHTENDERED_IS_REQUIRED = false;

    public static final boolean EMPLOYEEID_IS_REQUIRED = false;
    public static final long EMPLOYEEID_MAX_LEN = 13;

    public static final boolean EMPLOYEENAME_IS_REQUIRED = false;
    public static final long EMPLOYEENAME_MAX_LEN = 127;

    public static final boolean AUTHORIZATIONCODE_IS_REQUIRED = false;

    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final long EXTERNALPAYMENTID_MAX_LEN = 32;

    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNTRATES_IS_REQUIRED = false;

    public static final boolean LINEITEMS_IS_REQUIRED = false;

    public static final boolean CARD_IS_REQUIRED = false;

  }

}
