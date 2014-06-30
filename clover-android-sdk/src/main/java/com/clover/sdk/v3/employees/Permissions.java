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

package com.clover.sdk.v3.employees;

@SuppressWarnings("all")
public final class Permissions implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public static final String AUTHORITY = "com.clover.roles";

  private enum CacheKey {
    id {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.extractId();
      }
    },
    bits {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.extractBits();
      }
    },
    readablePermissions {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.extractReadablePermissions();
      }
    },
    ;

    public abstract Object extractValue(Permissions instance);
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
  public Permissions() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Permissions(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Permissions(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Permissions(Permissions src) {
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
   * A bitmap representing the permissions
   */
  public java.lang.Long getBits() {
    return cacheGet(CacheKey.bits);
  }

  private java.lang.Long extractBits() {
    return getJSONObject().isNull("bits") ? null :
      getJSONObject().optLong("bits");
  }

  /**
   * A readable list of permissions
   *
   * The returned List is unmodifiable and will never contain any nulls, even if the source JSON had null entries.
   */
  public java.util.List<com.clover.sdk.v3.employees.Permission> getReadablePermissions() {
    return cacheGet(CacheKey.readablePermissions);
  }

  private java.util.List<com.clover.sdk.v3.employees.Permission> extractReadablePermissions() {
    if (getJSONObject().isNull("readablePermissions")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("readablePermissions");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.employees.Permission> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.employees.Permission>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      String enumString = itemArray.optString(i, null);
      if (enumString == null) {
        continue;
      }
      com.clover.sdk.v3.employees.Permission item;
      try {
        item = com.clover.sdk.v3.employees.Permission.valueOf(enumString);
      } catch (Exception e) {
        e.printStackTrace();
        continue;
      }
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'bits' field is set and is not null */
  public boolean isNotNullBits() {
    return cacheValueIsNotNull(CacheKey.bits);
  }

  /** Checks whether the 'readablePermissions' field is set and is not null */
  public boolean isNotNullReadablePermissions() {
    return cacheValueIsNotNull(CacheKey.readablePermissions);
  }

  /** Checks whether the 'readablePermissions' field is set and is not null and is not empty */
  public boolean isNotEmptyReadablePermissions() {
    return isNotNullReadablePermissions() && !getReadablePermissions().isEmpty();
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'bits' field has been set, however the value could be null */
  public boolean hasBits() {
    return cacheHasKey(CacheKey.bits);
  }

  /** Checks whether the 'readablePermissions' field has been set, however the value could be null */
  public boolean hasReadablePermissions() {
    return cacheHasKey(CacheKey.readablePermissions);
  }


  /**
   * Sets the field 'id'.
   */
  public Permissions setId(java.lang.String id) {
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
   * Sets the field 'bits'.
   */
  public Permissions setBits(java.lang.Long bits) {
    logChange("bits");

    try {
      getJSONObject().put("bits", bits == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(bits));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.bits);
    return this;
  }

  /**
   * Sets the field 'readablePermissions'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Permissions setReadablePermissions(java.util.List<com.clover.sdk.v3.employees.Permission> readablePermissions) {
    logChange("readablePermissions");

    try {
      if (readablePermissions == null) {
        getJSONObject().put("readablePermissions", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.readablePermissions);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.employees.Permission obj : readablePermissions) {
        if (obj == null) {
          continue;
        }
        array.put(obj);
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("readablePermissions", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.readablePermissions);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'bits' field, the 'has' method for this field will now return false */
  public void clearBits() {
    unlogChange("bits");
    getJSONObject().remove("bits");
    cacheRemoveValue(CacheKey.bits);
  }

  /** Clears the 'readablePermissions' field, the 'has' method for this field will now return false */
  public void clearReadablePermissions() {
    unlogChange("readablePermissions");
    getJSONObject().remove("readablePermissions");
    cacheRemoveValue(CacheKey.readablePermissions);
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
  public Permissions copyChanges() {
    Permissions copy = new Permissions();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Permissions src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new Permissions(src).getJSONObject();
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

    return "Permissions{" +
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

  public static final android.os.Parcelable.Creator<Permissions> CREATOR = new android.os.Parcelable.Creator<Permissions>() {
    @Override
    public Permissions createFromParcel(android.os.Parcel in) {
      Permissions instance = new Permissions(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public Permissions[] newArray(int size) {
      return new Permissions[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Permissions> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Permissions>() {
    @Override
    public Permissions create(org.json.JSONObject jsonObject) {
      return new Permissions(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean BITS_IS_REQUIRED = false;

    public static final boolean READABLEPERMISSIONS_IS_REQUIRED = false;

  }

}
