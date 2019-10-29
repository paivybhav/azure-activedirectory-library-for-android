/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * The storage account update parameters.
 */
@ApiModel(description = "The storage account update parameters.")

public class StorageAccountUpdateParameters {
  @SerializedName("activeKeyName")
  private String activeKeyName = null;

  @SerializedName("autoRegenerateKey")
  private Boolean autoRegenerateKey = null;

  @SerializedName("regenerationPeriod")
  private String regenerationPeriod = null;

  @SerializedName("attributes")
  private StorageAccountAttributes attributes = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  public StorageAccountUpdateParameters activeKeyName(String activeKeyName) {
    this.activeKeyName = activeKeyName;
    return this;
  }

   /**
   * The current active storage account key name.
   * @return activeKeyName
  **/
  @ApiModelProperty(value = "The current active storage account key name.")
  public String getActiveKeyName() {
    return activeKeyName;
  }

  public void setActiveKeyName(String activeKeyName) {
    this.activeKeyName = activeKeyName;
  }

  public StorageAccountUpdateParameters autoRegenerateKey(Boolean autoRegenerateKey) {
    this.autoRegenerateKey = autoRegenerateKey;
    return this;
  }

   /**
   * whether keyvault should manage the storage account for the user.
   * @return autoRegenerateKey
  **/
  @ApiModelProperty(value = "whether keyvault should manage the storage account for the user.")
  public Boolean isAutoRegenerateKey() {
    return autoRegenerateKey;
  }

  public void setAutoRegenerateKey(Boolean autoRegenerateKey) {
    this.autoRegenerateKey = autoRegenerateKey;
  }

  public StorageAccountUpdateParameters regenerationPeriod(String regenerationPeriod) {
    this.regenerationPeriod = regenerationPeriod;
    return this;
  }

   /**
   * The key regeneration time duration specified in ISO-8601 format.
   * @return regenerationPeriod
  **/
  @ApiModelProperty(value = "The key regeneration time duration specified in ISO-8601 format.")
  public String getRegenerationPeriod() {
    return regenerationPeriod;
  }

  public void setRegenerationPeriod(String regenerationPeriod) {
    this.regenerationPeriod = regenerationPeriod;
  }

  public StorageAccountUpdateParameters attributes(StorageAccountAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * The attributes of the storage account.
   * @return attributes
  **/
  @ApiModelProperty(value = "The attributes of the storage account.")
  public StorageAccountAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(StorageAccountAttributes attributes) {
    this.attributes = attributes;
  }

  public StorageAccountUpdateParameters tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public StorageAccountUpdateParameters putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Application specific metadata in the form of key-value pairs.
   * @return tags
  **/
  @ApiModelProperty(value = "Application specific metadata in the form of key-value pairs.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountUpdateParameters storageAccountUpdateParameters = (StorageAccountUpdateParameters) o;
    return Objects.equals(this.activeKeyName, storageAccountUpdateParameters.activeKeyName) &&
        Objects.equals(this.autoRegenerateKey, storageAccountUpdateParameters.autoRegenerateKey) &&
        Objects.equals(this.regenerationPeriod, storageAccountUpdateParameters.regenerationPeriod) &&
        Objects.equals(this.attributes, storageAccountUpdateParameters.attributes) &&
        Objects.equals(this.tags, storageAccountUpdateParameters.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeKeyName, autoRegenerateKey, regenerationPeriod, attributes, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountUpdateParameters {\n");
    
    sb.append("    activeKeyName: ").append(toIndentedString(activeKeyName)).append("\n");
    sb.append("    autoRegenerateKey: ").append(toIndentedString(autoRegenerateKey)).append("\n");
    sb.append("    regenerationPeriod: ").append(toIndentedString(regenerationPeriod)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
