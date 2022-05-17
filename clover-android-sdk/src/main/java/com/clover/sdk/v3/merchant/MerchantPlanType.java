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

package com.clover.sdk.v3.merchant;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 */
@SuppressWarnings("all")
public enum MerchantPlanType implements Parcelable {
  PAYMENTS, PAYMENTS_PLUS, REGISTER_LITE, CLASSIC, REGISTER, DINING, QSR;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<MerchantPlanType> CREATOR = new Creator<MerchantPlanType>() {
    @Override
    public MerchantPlanType createFromParcel(final Parcel source) {
      return MerchantPlanType.valueOf(source.readString());
    }

    @Override
    public MerchantPlanType[] newArray(final int size) {
      return new MerchantPlanType[size];
    }
  };
}
