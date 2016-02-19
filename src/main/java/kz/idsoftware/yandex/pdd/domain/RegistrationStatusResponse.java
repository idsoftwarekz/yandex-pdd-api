package kz.idsoftware.yandex.pdd.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RegistrationStatusResponse extends RegisterResponse {

  @SerializedName("check_results")
  private DomainCheckResult checkResult;

  @SerializedName("next_check")
  private Date nextCheck;

  @SerializedName("last_check")
  private Date lastCheck;

  public DomainCheckResult getCheckResult() {
    return checkResult;
  }

  public void setCheckResult(DomainCheckResult checkResult) {
    this.checkResult = checkResult;
  }

  public Date getNextCheck() {
    return nextCheck;
  }

  public void setNextCheck(Date nextCheck) {
    this.nextCheck = nextCheck;
  }

  public Date getLastCheck() {
    return lastCheck;
  }

  public void setLastCheck(Date lastCheck) {
    this.lastCheck = lastCheck;
  }
}
