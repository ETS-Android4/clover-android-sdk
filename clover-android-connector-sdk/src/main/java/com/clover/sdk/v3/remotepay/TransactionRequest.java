/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getOrderId orderId}</li>
 * <li>{@link #getSignatureThreshold signatureThreshold}</li>
 * <li>{@link #getDisablePrinting disablePrinting}</li>
 * <li>{@link #getDisableReceiptSelection disableReceiptSelection}</li>
 * <li>{@link #getDisableDuplicateChecking disableDuplicateChecking}</li>
 * <li>{@link #getSignatureEntryLocation signatureEntryLocation}</li>
 * <li>{@link #getCardNotPresent cardNotPresent}</li>
 * <li>{@link #getDisableRestartTransactionOnFail disableRestartTransactionOnFail}</li>
 * <li>{@link #getAmount amount}</li>
 * <li>{@link #getCardEntryMethods cardEntryMethods}</li>
 * <li>{@link #getVaultedCard vaultedCard}</li>
 * <li>{@link #getExternalId externalId}</li>
 * <li>{@link #getType type}</li>
 * <li>{@link #getAutoAcceptPaymentConfirmations autoAcceptPaymentConfirmations}</li>
 * <li>{@link #getAutoAcceptSignature autoAcceptSignature}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TransactionRequest extends com.clover.sdk.v3.remotepay.BaseRequest {

  /**
   * Identifier for the order to apply this to.  The order must exist in the clover system.
   */
  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }

  /**
   * If the amount is equal to or greater than this amount, then a signature should be obtained
   */
  public java.lang.Long getSignatureThreshold() {
    return genClient.cacheGet(CacheKey.signatureThreshold);
  }

  /**
   * If true, then do not print using the clover printer.  Return print information.
   */
  public java.lang.Boolean getDisablePrinting() {
    return genClient.cacheGet(CacheKey.disablePrinting);
  }

  /**
   * Do not show the receipt options screen
   */
  public java.lang.Boolean getDisableReceiptSelection() {
    return genClient.cacheGet(CacheKey.disableReceiptSelection);
  }

  /**
   * Do not do heuristic duplicate checking
   */
  public java.lang.Boolean getDisableDuplicateChecking() {
    return genClient.cacheGet(CacheKey.disableDuplicateChecking);
  }

  /**
   * Where the signature should be obtined from (paper, screen...etc)
   */
  public com.clover.sdk.v3.payments.DataEntryLocation getSignatureEntryLocation() {
    return genClient.cacheGet(CacheKey.signatureEntryLocation);
  }

  /**
   * If true then card not present is accepted
   */
  public java.lang.Boolean getCardNotPresent() {
    return genClient.cacheGet(CacheKey.cardNotPresent);
  }

  /**
   * If the transaction times out or fails because of decline, do not restart it
   */
  public java.lang.Boolean getDisableRestartTransactionOnFail() {
    return genClient.cacheGet(CacheKey.disableRestartTransactionOnFail);
  }

  /**
   * Total amount paid
   */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * Allowed entry methods
   */
  public java.lang.Integer getCardEntryMethods() {
    return genClient.cacheGet(CacheKey.cardEntryMethods);
  }

  /**
   * A saved card
   */
  public com.clover.sdk.v3.payments.VaultedCard getVaultedCard() {
    return genClient.cacheGet(CacheKey.vaultedCard);
  }

  /**
   * An id that will be persisted with transactions.
   */
  public java.lang.String getExternalId() {
    return genClient.cacheGet(CacheKey.externalId);
  }

  /**
   * The type of the transaction.
   */
  public com.clover.sdk.v3.remotepay.TransactionType getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * Do not show/send potential duplicate challenges
   */
  public java.lang.Boolean getAutoAcceptPaymentConfirmations() {
    return genClient.cacheGet(CacheKey.autoAcceptPaymentConfirmations);
  }

  /**
   * Do not show/send signature verification challenges
   */
  public java.lang.Boolean getAutoAcceptSignature() {
    return genClient.cacheGet(CacheKey.autoAcceptSignature);
  }

  /**
   * Identifier for the request
   */
  @Override
  public java.lang.String getRequestId() {
    return genClient.cacheGet(CacheKey.requestId);
  }

  /**
   * Identifier for the version
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TransactionRequest> {
    orderId {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("orderId", java.lang.String.class);
      }
    },
    signatureThreshold {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("signatureThreshold", java.lang.Long.class);
      }
    },
    disablePrinting {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("disablePrinting", java.lang.Boolean.class);
      }
    },
    disableReceiptSelection {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("disableReceiptSelection", java.lang.Boolean.class);
      }
    },
    disableDuplicateChecking {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("disableDuplicateChecking", java.lang.Boolean.class);
      }
    },
    signatureEntryLocation {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractEnum("signatureEntryLocation", com.clover.sdk.v3.payments.DataEntryLocation.class);
      }
    },
    cardNotPresent {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("cardNotPresent", java.lang.Boolean.class);
      }
    },
    disableRestartTransactionOnFail {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("disableRestartTransactionOnFail", java.lang.Boolean.class);
      }
    },
    amount {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    cardEntryMethods {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("cardEntryMethods", java.lang.Integer.class);
      }
    },
    vaultedCard {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractRecord("vaultedCard", com.clover.sdk.v3.payments.VaultedCard.JSON_CREATOR);
      }
    },
    externalId {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("externalId", java.lang.String.class);
      }
    },
    type {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractEnum("type", com.clover.sdk.v3.remotepay.TransactionType.class);
      }
    },
    autoAcceptPaymentConfirmations {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("autoAcceptPaymentConfirmations", java.lang.Boolean.class);
      }
    },
    autoAcceptSignature {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("autoAcceptSignature", java.lang.Boolean.class);
      }
    },
    requestId {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("requestId", java.lang.String.class);
      }
    },
    version {
      @Override
      public Object extractValue(TransactionRequest instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<TransactionRequest> genClient;

  /**
  * Constructs a new empty instance.
  */
  public TransactionRequest() {
    super(false);
    genClient = new GenericClient<TransactionRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected TransactionRequest(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TransactionRequest(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public TransactionRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TransactionRequest(TransactionRequest src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {

    genClient.validateLength(getOrderId(), 13);

    genClient.validateNull(getAmount(), "amount");

    genClient.validateNull(getExternalId(), "externalId");
    genClient.validateLength(getRequestId(), 13);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'signatureThreshold' field is set and is not null */
  public boolean isNotNullSignatureThreshold() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'disablePrinting' field is set and is not null */
  public boolean isNotNullDisablePrinting() {
    return genClient.cacheValueIsNotNull(CacheKey.disablePrinting);
  }

  /** Checks whether the 'disableReceiptSelection' field is set and is not null */
  public boolean isNotNullDisableReceiptSelection() {
    return genClient.cacheValueIsNotNull(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateChecking' field is set and is not null */
  public boolean isNotNullDisableDuplicateChecking() {
    return genClient.cacheValueIsNotNull(CacheKey.disableDuplicateChecking);
  }

  /** Checks whether the 'signatureEntryLocation' field is set and is not null */
  public boolean isNotNullSignatureEntryLocation() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'cardNotPresent' field is set and is not null */
  public boolean isNotNullCardNotPresent() {
    return genClient.cacheValueIsNotNull(CacheKey.cardNotPresent);
  }

  /** Checks whether the 'disableRestartTransactionOnFail' field is set and is not null */
  public boolean isNotNullDisableRestartTransactionOnFail() {
    return genClient.cacheValueIsNotNull(CacheKey.disableRestartTransactionOnFail);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'cardEntryMethods' field is set and is not null */
  public boolean isNotNullCardEntryMethods() {
    return genClient.cacheValueIsNotNull(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'vaultedCard' field is set and is not null */
  public boolean isNotNullVaultedCard() {
    return genClient.cacheValueIsNotNull(CacheKey.vaultedCard);
  }

  /** Checks whether the 'externalId' field is set and is not null */
  public boolean isNotNullExternalId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalId);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field is set and is not null */
  public boolean isNotNullAutoAcceptPaymentConfirmations() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field is set and is not null */
  public boolean isNotNullAutoAcceptSignature() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'requestId' field is set and is not null */
  @Override
  public boolean isNotNullRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.requestId);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'signatureThreshold' field has been set, however the value could be null */
  public boolean hasSignatureThreshold() {
    return genClient.cacheHasKey(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'disablePrinting' field has been set, however the value could be null */
  public boolean hasDisablePrinting() {
    return genClient.cacheHasKey(CacheKey.disablePrinting);
  }

  /** Checks whether the 'disableReceiptSelection' field has been set, however the value could be null */
  public boolean hasDisableReceiptSelection() {
    return genClient.cacheHasKey(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateChecking' field has been set, however the value could be null */
  public boolean hasDisableDuplicateChecking() {
    return genClient.cacheHasKey(CacheKey.disableDuplicateChecking);
  }

  /** Checks whether the 'signatureEntryLocation' field has been set, however the value could be null */
  public boolean hasSignatureEntryLocation() {
    return genClient.cacheHasKey(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'cardNotPresent' field has been set, however the value could be null */
  public boolean hasCardNotPresent() {
    return genClient.cacheHasKey(CacheKey.cardNotPresent);
  }

  /** Checks whether the 'disableRestartTransactionOnFail' field has been set, however the value could be null */
  public boolean hasDisableRestartTransactionOnFail() {
    return genClient.cacheHasKey(CacheKey.disableRestartTransactionOnFail);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'cardEntryMethods' field has been set, however the value could be null */
  public boolean hasCardEntryMethods() {
    return genClient.cacheHasKey(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'vaultedCard' field has been set, however the value could be null */
  public boolean hasVaultedCard() {
    return genClient.cacheHasKey(CacheKey.vaultedCard);
  }

  /** Checks whether the 'externalId' field has been set, however the value could be null */
  public boolean hasExternalId() {
    return genClient.cacheHasKey(CacheKey.externalId);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field has been set, however the value could be null */
  public boolean hasAutoAcceptPaymentConfirmations() {
    return genClient.cacheHasKey(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field has been set, however the value could be null */
  public boolean hasAutoAcceptSignature() {
    return genClient.cacheHasKey(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'requestId' field has been set, however the value could be null */
  @Override
  public boolean hasRequestId() {
    return genClient.cacheHasKey(CacheKey.requestId);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'orderId'.
   */
  public TransactionRequest setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'signatureThreshold'.
   */
  public TransactionRequest setSignatureThreshold(java.lang.Long signatureThreshold) {
    return genClient.setOther(signatureThreshold, CacheKey.signatureThreshold);
  }

  /**
   * Sets the field 'disablePrinting'.
   */
  public TransactionRequest setDisablePrinting(java.lang.Boolean disablePrinting) {
    return genClient.setOther(disablePrinting, CacheKey.disablePrinting);
  }

  /**
   * Sets the field 'disableReceiptSelection'.
   */
  public TransactionRequest setDisableReceiptSelection(java.lang.Boolean disableReceiptSelection) {
    return genClient.setOther(disableReceiptSelection, CacheKey.disableReceiptSelection);
  }

  /**
   * Sets the field 'disableDuplicateChecking'.
   */
  public TransactionRequest setDisableDuplicateChecking(java.lang.Boolean disableDuplicateChecking) {
    return genClient.setOther(disableDuplicateChecking, CacheKey.disableDuplicateChecking);
  }

  /**
   * Sets the field 'signatureEntryLocation'.
   */
  public TransactionRequest setSignatureEntryLocation(com.clover.sdk.v3.payments.DataEntryLocation signatureEntryLocation) {
    return genClient.setOther(signatureEntryLocation, CacheKey.signatureEntryLocation);
  }

  /**
   * Sets the field 'cardNotPresent'.
   */
  public TransactionRequest setCardNotPresent(java.lang.Boolean cardNotPresent) {
    return genClient.setOther(cardNotPresent, CacheKey.cardNotPresent);
  }

  /**
   * Sets the field 'disableRestartTransactionOnFail'.
   */
  public TransactionRequest setDisableRestartTransactionOnFail(java.lang.Boolean disableRestartTransactionOnFail) {
    return genClient.setOther(disableRestartTransactionOnFail, CacheKey.disableRestartTransactionOnFail);
  }

  /**
   * Sets the field 'amount'.
   */
  public TransactionRequest setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'cardEntryMethods'.
   */
  public TransactionRequest setCardEntryMethods(java.lang.Integer cardEntryMethods) {
    return genClient.setOther(cardEntryMethods, CacheKey.cardEntryMethods);
  }

  /**
   * Sets the field 'vaultedCard'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TransactionRequest setVaultedCard(com.clover.sdk.v3.payments.VaultedCard vaultedCard) {
    return genClient.setRecord(vaultedCard, CacheKey.vaultedCard);
  }

  /**
   * Sets the field 'externalId'.
   */
  public TransactionRequest setExternalId(java.lang.String externalId) {
    return genClient.setOther(externalId, CacheKey.externalId);
  }

  /**
   * Sets the field 'type'.
   */
  public TransactionRequest setType(com.clover.sdk.v3.remotepay.TransactionType type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'autoAcceptPaymentConfirmations'.
   */
  public TransactionRequest setAutoAcceptPaymentConfirmations(java.lang.Boolean autoAcceptPaymentConfirmations) {
    return genClient.setOther(autoAcceptPaymentConfirmations, CacheKey.autoAcceptPaymentConfirmations);
  }

  /**
   * Sets the field 'autoAcceptSignature'.
   */
  public TransactionRequest setAutoAcceptSignature(java.lang.Boolean autoAcceptSignature) {
    return genClient.setOther(autoAcceptSignature, CacheKey.autoAcceptSignature);
  }

  /**
   * Sets the field 'requestId'.
   */
  @Override
  public BaseRequest setRequestId(java.lang.String requestId) {
    return genClient.setOther(requestId, CacheKey.requestId);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public BaseRequest setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'signatureThreshold' field, the 'has' method for this field will now return false */
  public void clearSignatureThreshold() {
    genClient.clear(CacheKey.signatureThreshold);
  }
  /** Clears the 'disablePrinting' field, the 'has' method for this field will now return false */
  public void clearDisablePrinting() {
    genClient.clear(CacheKey.disablePrinting);
  }
  /** Clears the 'disableReceiptSelection' field, the 'has' method for this field will now return false */
  public void clearDisableReceiptSelection() {
    genClient.clear(CacheKey.disableReceiptSelection);
  }
  /** Clears the 'disableDuplicateChecking' field, the 'has' method for this field will now return false */
  public void clearDisableDuplicateChecking() {
    genClient.clear(CacheKey.disableDuplicateChecking);
  }
  /** Clears the 'signatureEntryLocation' field, the 'has' method for this field will now return false */
  public void clearSignatureEntryLocation() {
    genClient.clear(CacheKey.signatureEntryLocation);
  }
  /** Clears the 'cardNotPresent' field, the 'has' method for this field will now return false */
  public void clearCardNotPresent() {
    genClient.clear(CacheKey.cardNotPresent);
  }
  /** Clears the 'disableRestartTransactionOnFail' field, the 'has' method for this field will now return false */
  public void clearDisableRestartTransactionOnFail() {
    genClient.clear(CacheKey.disableRestartTransactionOnFail);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'cardEntryMethods' field, the 'has' method for this field will now return false */
  public void clearCardEntryMethods() {
    genClient.clear(CacheKey.cardEntryMethods);
  }
  /** Clears the 'vaultedCard' field, the 'has' method for this field will now return false */
  public void clearVaultedCard() {
    genClient.clear(CacheKey.vaultedCard);
  }
  /** Clears the 'externalId' field, the 'has' method for this field will now return false */
  public void clearExternalId() {
    genClient.clear(CacheKey.externalId);
  }
  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'autoAcceptPaymentConfirmations' field, the 'has' method for this field will now return false */
  public void clearAutoAcceptPaymentConfirmations() {
    genClient.clear(CacheKey.autoAcceptPaymentConfirmations);
  }
  /** Clears the 'autoAcceptSignature' field, the 'has' method for this field will now return false */
  public void clearAutoAcceptSignature() {
    genClient.clear(CacheKey.autoAcceptSignature);
  }
  /** Clears the 'requestId' field, the 'has' method for this field will now return false */
  @Override
  public void clearRequestId() {
    genClient.clear(CacheKey.requestId);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public TransactionRequest copyChanges() {
    TransactionRequest copy = new TransactionRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TransactionRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TransactionRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TransactionRequest> CREATOR = new android.os.Parcelable.Creator<TransactionRequest>() {
    @Override
    public TransactionRequest createFromParcel(android.os.Parcel in) {
      TransactionRequest instance = new TransactionRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TransactionRequest[] newArray(int size) {
      return new TransactionRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TransactionRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TransactionRequest>() {
    @Override
    public TransactionRequest create(org.json.JSONObject jsonObject) {
      return new TransactionRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;
    public static final boolean SIGNATURETHRESHOLD_IS_REQUIRED = false;
    public static final boolean DISABLEPRINTING_IS_REQUIRED = false;
    public static final boolean DISABLERECEIPTSELECTION_IS_REQUIRED = false;
    public static final boolean DISABLEDUPLICATECHECKING_IS_REQUIRED = false;
    public static final boolean SIGNATUREENTRYLOCATION_IS_REQUIRED = false;
    public static final boolean CARDNOTPRESENT_IS_REQUIRED = false;
    public static final boolean DISABLERESTARTTRANSACTIONONFAIL_IS_REQUIRED = false;
    public static final boolean AMOUNT_IS_REQUIRED = true;
    public static final boolean CARDENTRYMETHODS_IS_REQUIRED = false;
    public static final boolean VAULTEDCARD_IS_REQUIRED = false;
    public static final boolean EXTERNALID_IS_REQUIRED = true;
    public static final boolean TYPE_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTPAYMENTCONFIRMATIONS_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTSIGNATURE_IS_REQUIRED = false;
    public static final boolean REQUESTID_IS_REQUIRED = false;
    public static final long REQUESTID_MAX_LEN = 13;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
