package kz.idsoftware.yandex.pdd;

public enum SuccessResult {

  OK("ok"),
  ERROR("error");

  private String value;

  private SuccessResult(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }

}
