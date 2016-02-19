package kz.idsoftware.yandex.pdd.domain;

import kz.idsoftware.yandex.pdd.SuccessResult;

public class RegisterResponse {

  private String domain;
  private DomainStatus status;
  private DomainStage stage;
  private SecretData secrets;
  private SuccessResult success;
  private String error;

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DomainStatus getStatus() {
    return status;
  }

  public void setStatus(DomainStatus status) {
    this.status = status;
  }

  public DomainStage getStage() {
    return stage;
  }

  public void setStage(DomainStage stage) {
    this.stage = stage;
  }

  public SecretData getSecrets() {
    return secrets;
  }

  public void setSecrets(SecretData secrets) {
    this.secrets = secrets;
  }

  public SuccessResult getSuccess() {
    return success;
  }

  public void setSuccess(SuccessResult success) {
    this.success = success;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
