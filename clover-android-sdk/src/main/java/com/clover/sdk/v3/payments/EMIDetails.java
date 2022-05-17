/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getLenderName lenderName}</li>
 * <li>{@link #getTenure tenure}</li>
 * <li>{@link #getInterestRate interestRate}</li>
 * <li>{@link #getInterest interest}</li>
 * <li>{@link #getEmiAmount emiAmount}</li>
 * <li>{@link #getLenderLoanId lenderLoanId}</li>
 * <li>{@link #getFees fees}</li>
 * <li>{@link #getDiscountAmount discountAmount}</li>
 * <li>{@link #getOfferCashback offerCashback}</li>
 * <li>{@link #getTranAmount tranAmount}</li>
 * <li>{@link #getTotalPayable totalPayable}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class EMIDetails extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * This field contains the EMI lender name
   */
  public String getLenderName() {
    return genClient.cacheGet(CacheKey.lenderName);
  }

  /**
   * This field contains total EMI tenure
   */
  public String getTenure() {
    return genClient.cacheGet(CacheKey.tenure);
  }

  /**
   * This field contains interest rate charged as part of EMI
   */
  public String getInterestRate() {
    return genClient.cacheGet(CacheKey.interestRate);
  }

  /**
   * This field contains interest amount charged as part of EMI
   */
  public String getInterest() {
    return genClient.cacheGet(CacheKey.interest);
  }

  /**
   * This field contains EMI amount per month
   */
  public String getEmiAmount() {
    return genClient.cacheGet(CacheKey.emiAmount);
  }

  /**
   * This field contains lender loan id for the EMI
   */
  public String getLenderLoanId() {
    return genClient.cacheGet(CacheKey.lenderLoanId);
  }

  /**
   * This field contains processing fee charged for EMI
   */
  public String getFees() {
    return genClient.cacheGet(CacheKey.fees);
  }

  /**
   * This field contains discount amount provided for EMI
   */
  public String getDiscountAmount() {
    return genClient.cacheGet(CacheKey.discountAmount);
  }

  /**
   * This field contains offer cashback amount provided for EMI
   */
  public String getOfferCashback() {
    return genClient.cacheGet(CacheKey.offerCashback);
  }

  /**
   * This field contains total transaction amount
   */
  public String getTranAmount() {
    return genClient.cacheGet(CacheKey.tranAmount);
  }

  /**
   * This field contains total payable amount i.e. total EMI with interest
   */
  public String getTotalPayable() {
    return genClient.cacheGet(CacheKey.totalPayable);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    lenderName
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    tenure
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    interestRate
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    interest
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    emiAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    lenderLoanId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    fees
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    discountAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    offerCashback
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    tranAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    totalPayable
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<EMIDetails> genClient;

  /**
   * Constructs a new empty instance.
   */
  public EMIDetails() {
    genClient = new GenericClient<EMIDetails>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected EMIDetails(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public EMIDetails(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public EMIDetails(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public EMIDetails(EMIDetails src) {
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
  }

  /** Checks whether the 'lenderName' field is set and is not null */
  public boolean isNotNullLenderName() {
    return genClient.cacheValueIsNotNull(CacheKey.lenderName);
  }

  /** Checks whether the 'tenure' field is set and is not null */
  public boolean isNotNullTenure() {
    return genClient.cacheValueIsNotNull(CacheKey.tenure);
  }

  /** Checks whether the 'interestRate' field is set and is not null */
  public boolean isNotNullInterestRate() {
    return genClient.cacheValueIsNotNull(CacheKey.interestRate);
  }

  /** Checks whether the 'interest' field is set and is not null */
  public boolean isNotNullInterest() {
    return genClient.cacheValueIsNotNull(CacheKey.interest);
  }

  /** Checks whether the 'emiAmount' field is set and is not null */
  public boolean isNotNullEmiAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.emiAmount);
  }

  /** Checks whether the 'lenderLoanId' field is set and is not null */
  public boolean isNotNullLenderLoanId() {
    return genClient.cacheValueIsNotNull(CacheKey.lenderLoanId);
  }

  /** Checks whether the 'fees' field is set and is not null */
  public boolean isNotNullFees() {
    return genClient.cacheValueIsNotNull(CacheKey.fees);
  }

  /** Checks whether the 'discountAmount' field is set and is not null */
  public boolean isNotNullDiscountAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.discountAmount);
  }

  /** Checks whether the 'offerCashback' field is set and is not null */
  public boolean isNotNullOfferCashback() {
    return genClient.cacheValueIsNotNull(CacheKey.offerCashback);
  }

  /** Checks whether the 'tranAmount' field is set and is not null */
  public boolean isNotNullTranAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tranAmount);
  }

  /** Checks whether the 'totalPayable' field is set and is not null */
  public boolean isNotNullTotalPayable() {
    return genClient.cacheValueIsNotNull(CacheKey.totalPayable);
  }



  /** Checks whether the 'lenderName' field has been set, however the value could be null */
  public boolean hasLenderName() {
    return genClient.cacheHasKey(CacheKey.lenderName);
  }

  /** Checks whether the 'tenure' field has been set, however the value could be null */
  public boolean hasTenure() {
    return genClient.cacheHasKey(CacheKey.tenure);
  }

  /** Checks whether the 'interestRate' field has been set, however the value could be null */
  public boolean hasInterestRate() {
    return genClient.cacheHasKey(CacheKey.interestRate);
  }

  /** Checks whether the 'interest' field has been set, however the value could be null */
  public boolean hasInterest() {
    return genClient.cacheHasKey(CacheKey.interest);
  }

  /** Checks whether the 'emiAmount' field has been set, however the value could be null */
  public boolean hasEmiAmount() {
    return genClient.cacheHasKey(CacheKey.emiAmount);
  }

  /** Checks whether the 'lenderLoanId' field has been set, however the value could be null */
  public boolean hasLenderLoanId() {
    return genClient.cacheHasKey(CacheKey.lenderLoanId);
  }

  /** Checks whether the 'fees' field has been set, however the value could be null */
  public boolean hasFees() {
    return genClient.cacheHasKey(CacheKey.fees);
  }

  /** Checks whether the 'discountAmount' field has been set, however the value could be null */
  public boolean hasDiscountAmount() {
    return genClient.cacheHasKey(CacheKey.discountAmount);
  }

  /** Checks whether the 'offerCashback' field has been set, however the value could be null */
  public boolean hasOfferCashback() {
    return genClient.cacheHasKey(CacheKey.offerCashback);
  }

  /** Checks whether the 'tranAmount' field has been set, however the value could be null */
  public boolean hasTranAmount() {
    return genClient.cacheHasKey(CacheKey.tranAmount);
  }

  /** Checks whether the 'totalPayable' field has been set, however the value could be null */
  public boolean hasTotalPayable() {
    return genClient.cacheHasKey(CacheKey.totalPayable);
  }


  /**
   * Sets the field 'lenderName'.
   */
  public EMIDetails setLenderName(String lenderName) {
    return genClient.setOther(lenderName, CacheKey.lenderName);
  }

  /**
   * Sets the field 'tenure'.
   */
  public EMIDetails setTenure(String tenure) {
    return genClient.setOther(tenure, CacheKey.tenure);
  }

  /**
   * Sets the field 'interestRate'.
   */
  public EMIDetails setInterestRate(String interestRate) {
    return genClient.setOther(interestRate, CacheKey.interestRate);
  }

  /**
   * Sets the field 'interest'.
   */
  public EMIDetails setInterest(String interest) {
    return genClient.setOther(interest, CacheKey.interest);
  }

  /**
   * Sets the field 'emiAmount'.
   */
  public EMIDetails setEmiAmount(String emiAmount) {
    return genClient.setOther(emiAmount, CacheKey.emiAmount);
  }

  /**
   * Sets the field 'lenderLoanId'.
   */
  public EMIDetails setLenderLoanId(String lenderLoanId) {
    return genClient.setOther(lenderLoanId, CacheKey.lenderLoanId);
  }

  /**
   * Sets the field 'fees'.
   */
  public EMIDetails setFees(String fees) {
    return genClient.setOther(fees, CacheKey.fees);
  }

  /**
   * Sets the field 'discountAmount'.
   */
  public EMIDetails setDiscountAmount(String discountAmount) {
    return genClient.setOther(discountAmount, CacheKey.discountAmount);
  }

  /**
   * Sets the field 'offerCashback'.
   */
  public EMIDetails setOfferCashback(String offerCashback) {
    return genClient.setOther(offerCashback, CacheKey.offerCashback);
  }

  /**
   * Sets the field 'tranAmount'.
   */
  public EMIDetails setTranAmount(String tranAmount) {
    return genClient.setOther(tranAmount, CacheKey.tranAmount);
  }

  /**
   * Sets the field 'totalPayable'.
   */
  public EMIDetails setTotalPayable(String totalPayable) {
    return genClient.setOther(totalPayable, CacheKey.totalPayable);
  }


  /** Clears the 'lenderName' field, the 'has' method for this field will now return false */
  public void clearLenderName() {
    genClient.clear(CacheKey.lenderName);
  }
  /** Clears the 'tenure' field, the 'has' method for this field will now return false */
  public void clearTenure() {
    genClient.clear(CacheKey.tenure);
  }
  /** Clears the 'interestRate' field, the 'has' method for this field will now return false */
  public void clearInterestRate() {
    genClient.clear(CacheKey.interestRate);
  }
  /** Clears the 'interest' field, the 'has' method for this field will now return false */
  public void clearInterest() {
    genClient.clear(CacheKey.interest);
  }
  /** Clears the 'emiAmount' field, the 'has' method for this field will now return false */
  public void clearEmiAmount() {
    genClient.clear(CacheKey.emiAmount);
  }
  /** Clears the 'lenderLoanId' field, the 'has' method for this field will now return false */
  public void clearLenderLoanId() {
    genClient.clear(CacheKey.lenderLoanId);
  }
  /** Clears the 'fees' field, the 'has' method for this field will now return false */
  public void clearFees() {
    genClient.clear(CacheKey.fees);
  }
  /** Clears the 'discountAmount' field, the 'has' method for this field will now return false */
  public void clearDiscountAmount() {
    genClient.clear(CacheKey.discountAmount);
  }
  /** Clears the 'offerCashback' field, the 'has' method for this field will now return false */
  public void clearOfferCashback() {
    genClient.clear(CacheKey.offerCashback);
  }
  /** Clears the 'tranAmount' field, the 'has' method for this field will now return false */
  public void clearTranAmount() {
    genClient.clear(CacheKey.tranAmount);
  }
  /** Clears the 'totalPayable' field, the 'has' method for this field will now return false */
  public void clearTotalPayable() {
    genClient.clear(CacheKey.totalPayable);
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
  public EMIDetails copyChanges() {
    EMIDetails copy = new EMIDetails();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(EMIDetails src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new EMIDetails(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<EMIDetails> CREATOR = new android.os.Parcelable.Creator<EMIDetails>() {
    @Override
    public EMIDetails createFromParcel(android.os.Parcel in) {
      EMIDetails instance = new EMIDetails(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public EMIDetails[] newArray(int size) {
      return new EMIDetails[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<EMIDetails> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<EMIDetails>() {
    public Class<EMIDetails> getCreatedClass() {
      return EMIDetails.class;
    }

    @Override
    public EMIDetails create(org.json.JSONObject jsonObject) {
      return new EMIDetails(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean LENDERNAME_IS_REQUIRED = false;
    public static final boolean TENURE_IS_REQUIRED = false;
    public static final boolean INTERESTRATE_IS_REQUIRED = false;
    public static final boolean INTEREST_IS_REQUIRED = false;
    public static final boolean EMIAMOUNT_IS_REQUIRED = false;
    public static final boolean LENDERLOANID_IS_REQUIRED = false;
    public static final boolean FEES_IS_REQUIRED = false;
    public static final boolean DISCOUNTAMOUNT_IS_REQUIRED = false;
    public static final boolean OFFERCASHBACK_IS_REQUIRED = false;
    public static final boolean TRANAMOUNT_IS_REQUIRED = false;
    public static final boolean TOTALPAYABLE_IS_REQUIRED = false;
  }

}
