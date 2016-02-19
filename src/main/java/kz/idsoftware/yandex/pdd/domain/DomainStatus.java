package kz.idsoftware.yandex.pdd.domain;

public enum DomainStatus {

  DOMAIN_ACTIVATE("domain-activate"),
  MX_ACTIVATE("mx-activate"),
  ADDED("added");

  private String value;

  private DomainStatus(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

}
