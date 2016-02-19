package kz.idsoftware.yandex.pdd.domain;

public enum DomainStage {

  OWNER_CHECK("owner-check"),
  MX_CHECK("mx-check"),
  ADDED("added");

  private String value;

  private DomainStage(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

}
