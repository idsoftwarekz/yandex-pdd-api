package kz.idsoftware.yandex.pdd.domain;

import com.google.gson.annotations.SerializedName;

public enum DomainCheckResult {

  @SerializedName("ok")
  OK("ok"),

  @SerializedName("no-cname,no-file")
  NO_CNAME_NO_FILE("no-cname,no-file"),

  @SerializedName("bad-cname,bad-file")
  BAD_CNAME_BAD_FILE("bad-cname,bad-file"),

  @SerializedName("no-cname,bad-file")
  NO_CNAME_BAD_FILE("no-cname,bad-file"),

  @SerializedName("bad-cname,no-file")
  BAD_CNAME_NO_FILE("bad-cname,no-file"),

  @SerializedName("domain-not-found")
  DOMAIN_NOT_FOUND("domain-not-found"),

  @SerializedName("occupied")
  OCCUPIED("occupied"),

  @SerializedName("mx-wrong")
  MX_WRONG("mx-wrong"),

  @SerializedName("mx-not-found")
  MX_NOT_FOUND("mx-not-found");

  private String value;

  private DomainCheckResult(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

}
