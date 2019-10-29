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

/**
 * A condition to be satisfied for an action to be executed.
 */
@ApiModel(description = "A condition to be satisfied for an action to be executed.")

public class Trigger {
  @SerializedName("lifetime_percentage")
  private Integer lifetimePercentage = null;

  @SerializedName("days_before_expiry")
  private Integer daysBeforeExpiry = null;

  public Trigger lifetimePercentage(Integer lifetimePercentage) {
    this.lifetimePercentage = lifetimePercentage;
    return this;
  }

   /**
   * Percentage of lifetime at which to trigger. Value should be between 1 and 99.
   * minimum: 1
   * maximum: 99
   * @return lifetimePercentage
  **/
  @ApiModelProperty(value = "Percentage of lifetime at which to trigger. Value should be between 1 and 99.")
  public Integer getLifetimePercentage() {
    return lifetimePercentage;
  }

  public void setLifetimePercentage(Integer lifetimePercentage) {
    this.lifetimePercentage = lifetimePercentage;
  }

  public Trigger daysBeforeExpiry(Integer daysBeforeExpiry) {
    this.daysBeforeExpiry = daysBeforeExpiry;
    return this;
  }

   /**
   * Days before expiry to attempt renewal. Value should be between 1 and validity_in_months multiplied by 27. If validity_in_months is 36, then value should be between 1 and 972 (36 * 27).
   * @return daysBeforeExpiry
  **/
  @ApiModelProperty(value = "Days before expiry to attempt renewal. Value should be between 1 and validity_in_months multiplied by 27. If validity_in_months is 36, then value should be between 1 and 972 (36 * 27).")
  public Integer getDaysBeforeExpiry() {
    return daysBeforeExpiry;
  }

  public void setDaysBeforeExpiry(Integer daysBeforeExpiry) {
    this.daysBeforeExpiry = daysBeforeExpiry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.lifetimePercentage, trigger.lifetimePercentage) &&
        Objects.equals(this.daysBeforeExpiry, trigger.daysBeforeExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetimePercentage, daysBeforeExpiry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trigger {\n");
    
    sb.append("    lifetimePercentage: ").append(toIndentedString(lifetimePercentage)).append("\n");
    sb.append("    daysBeforeExpiry: ").append(toIndentedString(daysBeforeExpiry)).append("\n");
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
