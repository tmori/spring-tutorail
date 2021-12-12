package com.baitando.openapi.samples.gen.springbootserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TranslationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-12T13:02:27.537224+09:00[Asia/Tokyo]")
public class TranslationResponseDto   {
  @JsonProperty("detectedLanguage")
  private String detectedLanguage;

  @JsonProperty("translatedText")
  private String translatedText;

  @JsonProperty("translatedLanguage")
  private String translatedLanguage;

  public TranslationResponseDto detectedLanguage(String detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
    return this;
  }

  /**
   * Get detectedLanguage
   * @return detectedLanguage
  */
  @ApiModelProperty(example = "英語", required = true, value = "")
  @NotNull


  public String getDetectedLanguage() {
    return detectedLanguage;
  }

  public void setDetectedLanguage(String detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
  }

  public TranslationResponseDto translatedText(String translatedText) {
    this.translatedText = translatedText;
    return this;
  }

  /**
   * Get translatedText
   * @return translatedText
  */
  @ApiModelProperty(example = "はろーわーるど", required = true, value = "")
  @NotNull


  public String getTranslatedText() {
    return translatedText;
  }

  public void setTranslatedText(String translatedText) {
    this.translatedText = translatedText;
  }

  public TranslationResponseDto translatedLanguage(String translatedLanguage) {
    this.translatedLanguage = translatedLanguage;
    return this;
  }

  /**
   * Get translatedLanguage
   * @return translatedLanguage
  */
  @ApiModelProperty(example = "日本語", required = true, value = "")
  @NotNull


  public String getTranslatedLanguage() {
    return translatedLanguage;
  }

  public void setTranslatedLanguage(String translatedLanguage) {
    this.translatedLanguage = translatedLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationResponseDto translationResponse = (TranslationResponseDto) o;
    return Objects.equals(this.detectedLanguage, translationResponse.detectedLanguage) &&
        Objects.equals(this.translatedText, translationResponse.translatedText) &&
        Objects.equals(this.translatedLanguage, translationResponse.translatedLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedLanguage, translatedText, translatedLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationResponseDto {\n");
    
    sb.append("    detectedLanguage: ").append(toIndentedString(detectedLanguage)).append("\n");
    sb.append("    translatedText: ").append(toIndentedString(translatedText)).append("\n");
    sb.append("    translatedLanguage: ").append(toIndentedString(translatedLanguage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

