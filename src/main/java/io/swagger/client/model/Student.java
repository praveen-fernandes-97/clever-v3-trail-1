/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Credentials;
import io.swagger.client.model.Location;
import io.swagger.client.model.SchoolEnrollment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Student
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-25T09:14:56.929Z")
public class Student {
  @SerializedName("created")
  private String created = null;

  @SerializedName("credentials")
  private Credentials credentials = null;

  @SerializedName("dob")
  private String dob = null;

  /**
   * Gets or Sets ellStatus
   */
  @JsonAdapter(EllStatusEnum.Adapter.class)
  public enum EllStatusEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    EllStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EllStatusEnum fromValue(String text) {
      for (EllStatusEnum b : EllStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EllStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EllStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EllStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EllStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ell_status")
  private EllStatusEnum ellStatus = null;

  @SerializedName("enrollments")
  private List<SchoolEnrollment> enrollments = null;

  @SerializedName("ext")
  private Object ext = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    M("M"),
    
    F("F"),
    
    X("X"),
    
    EMPTY("");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gender")
  private GenderEnum gender = null;

  /**
   * Gets or Sets grade
   */
  @JsonAdapter(GradeEnum.Adapter.class)
  public enum GradeEnum {
    INFANTTODDLER("InfantToddler"),
    
    PRESCHOOL("Preschool"),
    
    PREKINDERGARTEN("PreKindergarten"),
    
    TRANSITIONALKINDERGARTEN("TransitionalKindergarten"),
    
    KINDERGARTEN("Kindergarten"),
    
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    POSTGRADUATE("PostGraduate"),
    
    UNGRADED("Ungraded"),
    
    OTHER("Other"),
    
    EMPTY("");

    private String value;

    GradeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GradeEnum fromValue(String text) {
      for (GradeEnum b : GradeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GradeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GradeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GradeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GradeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("grade")
  private GradeEnum grade = null;

  @SerializedName("graduation_year")
  private String graduationYear = null;

  /**
   * Gets or Sets hispanicEthnicity
   */
  @JsonAdapter(HispanicEthnicityEnum.Adapter.class)
  public enum HispanicEthnicityEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    HispanicEthnicityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HispanicEthnicityEnum fromValue(String text) {
      for (HispanicEthnicityEnum b : HispanicEthnicityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HispanicEthnicityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HispanicEthnicityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HispanicEthnicityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HispanicEthnicityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("hispanic_ethnicity")
  private HispanicEthnicityEnum hispanicEthnicity = null;

  /**
   * Gets or Sets homeLanguage
   */
  @JsonAdapter(HomeLanguageEnum.Adapter.class)
  public enum HomeLanguageEnum {
    ENGLISH("English"),
    
    ALBANIAN("Albanian"),
    
    AMHARIC("Amharic"),
    
    ARABIC("Arabic"),
    
    BENGALI("Bengali"),
    
    BOSNIAN("Bosnian"),
    
    BURMESE("Burmese"),
    
    CANTONESE("Cantonese"),
    
    CHINESE("Chinese"),
    
    DUTCH("Dutch"),
    
    FARSI("Farsi"),
    
    FRENCH("French"),
    
    GERMAN("German"),
    
    HEBREW("Hebrew"),
    
    HINDI("Hindi"),
    
    HMONG("Hmong"),
    
    ILOCANO("Ilocano"),
    
    JAPANESE("Japanese"),
    
    JAVANESE("Javanese"),
    
    KAREN("Karen"),
    
    KHMER("Khmer"),
    
    KOREAN("Korean"),
    
    LAOTIAN("Laotian"),
    
    LATVIAN("Latvian"),
    
    MALAY("Malay"),
    
    MANDARIN("Mandarin"),
    
    NEPALI("Nepali"),
    
    OROMO("Oromo"),
    
    POLISH("Polish"),
    
    PORTUGUESE("Portuguese"),
    
    PUNJABI("Punjabi"),
    
    ROMANIAN("Romanian"),
    
    RUSSIAN("Russian"),
    
    SAMOAN("Samoan"),
    
    SERBIAN("Serbian"),
    
    SOMALI("Somali"),
    
    SPANISH("Spanish"),
    
    SWAHILI("Swahili"),
    
    TAGALOG("Tagalog"),
    
    TAMIL("Tamil"),
    
    TELUGU("Telugu"),
    
    THAI("Thai"),
    
    TIGRINYA("Tigrinya"),
    
    TURKISH("Turkish"),
    
    UKRAINIAN("Ukrainian"),
    
    URDU("Urdu"),
    
    VIETNAMESE("Vietnamese"),
    
    EMPTY("");

    private String value;

    HomeLanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HomeLanguageEnum fromValue(String text) {
      for (HomeLanguageEnum b : HomeLanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HomeLanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HomeLanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HomeLanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HomeLanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("home_language")
  private HomeLanguageEnum homeLanguage = null;

  @SerializedName("iep_status")
  private String iepStatus = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("legacy_id")
  private String legacyId = null;

  @SerializedName("location")
  private Location location = null;

  /**
   * Gets or Sets race
   */
  @JsonAdapter(RaceEnum.Adapter.class)
  public enum RaceEnum {
    CAUCASIAN("Caucasian"),
    
    ASIAN("Asian"),
    
    BLACK_OR_AFRICAN_AMERICAN("Black or African American"),
    
    AMERICAN_INDIAN("American Indian"),
    
    HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("Hawaiian or Other Pacific Islander"),
    
    TWO_OR_MORE_RACES("Two or More Races"),
    
    UNKNOWN("Unknown"),
    
    EMPTY("");

    private String value;

    RaceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RaceEnum fromValue(String text) {
      for (RaceEnum b : RaceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RaceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RaceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RaceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RaceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("race")
  private RaceEnum race = null;

  @SerializedName("school")
  private String school = null;

  @SerializedName("schools")
  private List<String> schools = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("state_id")
  private String stateId = null;

  @SerializedName("student_number")
  private String studentNumber = null;

  @SerializedName("unweighted_gpa")
  private String unweightedGpa = null;

  @SerializedName("weighted_gpa")
  private String weightedGpa = null;

  public Student created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Student credentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public Student dob(String dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public Student ellStatus(EllStatusEnum ellStatus) {
    this.ellStatus = ellStatus;
    return this;
  }

   /**
   * Get ellStatus
   * @return ellStatus
  **/
  @ApiModelProperty(value = "")
  public EllStatusEnum getEllStatus() {
    return ellStatus;
  }

  public void setEllStatus(EllStatusEnum ellStatus) {
    this.ellStatus = ellStatus;
  }

  public Student enrollments(List<SchoolEnrollment> enrollments) {
    this.enrollments = enrollments;
    return this;
  }

  public Student addEnrollmentsItem(SchoolEnrollment enrollmentsItem) {
    if (this.enrollments == null) {
      this.enrollments = new ArrayList<SchoolEnrollment>();
    }
    this.enrollments.add(enrollmentsItem);
    return this;
  }

   /**
   * Get enrollments
   * @return enrollments
  **/
  @ApiModelProperty(value = "")
  public List<SchoolEnrollment> getEnrollments() {
    return enrollments;
  }

  public void setEnrollments(List<SchoolEnrollment> enrollments) {
    this.enrollments = enrollments;
  }

  public Student ext(Object ext) {
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @ApiModelProperty(value = "")
  public Object getExt() {
    return ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }

  public Student gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Student grade(GradeEnum grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  public GradeEnum getGrade() {
    return grade;
  }

  public void setGrade(GradeEnum grade) {
    this.grade = grade;
  }

  public Student graduationYear(String graduationYear) {
    this.graduationYear = graduationYear;
    return this;
  }

   /**
   * Get graduationYear
   * @return graduationYear
  **/
  @ApiModelProperty(value = "")
  public String getGraduationYear() {
    return graduationYear;
  }

  public void setGraduationYear(String graduationYear) {
    this.graduationYear = graduationYear;
  }

  public Student hispanicEthnicity(HispanicEthnicityEnum hispanicEthnicity) {
    this.hispanicEthnicity = hispanicEthnicity;
    return this;
  }

   /**
   * Get hispanicEthnicity
   * @return hispanicEthnicity
  **/
  @ApiModelProperty(value = "")
  public HispanicEthnicityEnum getHispanicEthnicity() {
    return hispanicEthnicity;
  }

  public void setHispanicEthnicity(HispanicEthnicityEnum hispanicEthnicity) {
    this.hispanicEthnicity = hispanicEthnicity;
  }

  public Student homeLanguage(HomeLanguageEnum homeLanguage) {
    this.homeLanguage = homeLanguage;
    return this;
  }

   /**
   * Get homeLanguage
   * @return homeLanguage
  **/
  @ApiModelProperty(value = "")
  public HomeLanguageEnum getHomeLanguage() {
    return homeLanguage;
  }

  public void setHomeLanguage(HomeLanguageEnum homeLanguage) {
    this.homeLanguage = homeLanguage;
  }

  public Student iepStatus(String iepStatus) {
    this.iepStatus = iepStatus;
    return this;
  }

   /**
   * Get iepStatus
   * @return iepStatus
  **/
  @ApiModelProperty(value = "")
  public String getIepStatus() {
    return iepStatus;
  }

  public void setIepStatus(String iepStatus) {
    this.iepStatus = iepStatus;
  }

  public Student lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Student legacyId(String legacyId) {
    this.legacyId = legacyId;
    return this;
  }

   /**
   * Get legacyId
   * @return legacyId
  **/
  @ApiModelProperty(value = "")
  public String getLegacyId() {
    return legacyId;
  }

  public void setLegacyId(String legacyId) {
    this.legacyId = legacyId;
  }

  public Student location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Student race(RaceEnum race) {
    this.race = race;
    return this;
  }

   /**
   * Get race
   * @return race
  **/
  @ApiModelProperty(value = "")
  public RaceEnum getRace() {
    return race;
  }

  public void setRace(RaceEnum race) {
    this.race = race;
  }

  public Student school(String school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Student schools(List<String> schools) {
    this.schools = schools;
    return this;
  }

  public Student addSchoolsItem(String schoolsItem) {
    if (this.schools == null) {
      this.schools = new ArrayList<String>();
    }
    this.schools.add(schoolsItem);
    return this;
  }

   /**
   * Get schools
   * @return schools
  **/
  @ApiModelProperty(value = "")
  public List<String> getSchools() {
    return schools;
  }

  public void setSchools(List<String> schools) {
    this.schools = schools;
  }

  public Student sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @ApiModelProperty(value = "")
  public String getSisId() {
    return sisId;
  }

  public void setSisId(String sisId) {
    this.sisId = sisId;
  }

  public Student stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public Student studentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
    return this;
  }

   /**
   * Get studentNumber
   * @return studentNumber
  **/
  @ApiModelProperty(value = "")
  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
  }

  public Student unweightedGpa(String unweightedGpa) {
    this.unweightedGpa = unweightedGpa;
    return this;
  }

   /**
   * Get unweightedGpa
   * @return unweightedGpa
  **/
  @ApiModelProperty(value = "")
  public String getUnweightedGpa() {
    return unweightedGpa;
  }

  public void setUnweightedGpa(String unweightedGpa) {
    this.unweightedGpa = unweightedGpa;
  }

  public Student weightedGpa(String weightedGpa) {
    this.weightedGpa = weightedGpa;
    return this;
  }

   /**
   * Get weightedGpa
   * @return weightedGpa
  **/
  @ApiModelProperty(value = "")
  public String getWeightedGpa() {
    return weightedGpa;
  }

  public void setWeightedGpa(String weightedGpa) {
    this.weightedGpa = weightedGpa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.created, student.created) &&
        Objects.equals(this.credentials, student.credentials) &&
        Objects.equals(this.dob, student.dob) &&
        Objects.equals(this.ellStatus, student.ellStatus) &&
        Objects.equals(this.enrollments, student.enrollments) &&
        Objects.equals(this.ext, student.ext) &&
        Objects.equals(this.gender, student.gender) &&
        Objects.equals(this.grade, student.grade) &&
        Objects.equals(this.graduationYear, student.graduationYear) &&
        Objects.equals(this.hispanicEthnicity, student.hispanicEthnicity) &&
        Objects.equals(this.homeLanguage, student.homeLanguage) &&
        Objects.equals(this.iepStatus, student.iepStatus) &&
        Objects.equals(this.lastModified, student.lastModified) &&
        Objects.equals(this.legacyId, student.legacyId) &&
        Objects.equals(this.location, student.location) &&
        Objects.equals(this.race, student.race) &&
        Objects.equals(this.school, student.school) &&
        Objects.equals(this.schools, student.schools) &&
        Objects.equals(this.sisId, student.sisId) &&
        Objects.equals(this.stateId, student.stateId) &&
        Objects.equals(this.studentNumber, student.studentNumber) &&
        Objects.equals(this.unweightedGpa, student.unweightedGpa) &&
        Objects.equals(this.weightedGpa, student.weightedGpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, credentials, dob, ellStatus, enrollments, ext, gender, grade, graduationYear, hispanicEthnicity, homeLanguage, iepStatus, lastModified, legacyId, location, race, school, schools, sisId, stateId, studentNumber, unweightedGpa, weightedGpa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    ellStatus: ").append(toIndentedString(ellStatus)).append("\n");
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    graduationYear: ").append(toIndentedString(graduationYear)).append("\n");
    sb.append("    hispanicEthnicity: ").append(toIndentedString(hispanicEthnicity)).append("\n");
    sb.append("    homeLanguage: ").append(toIndentedString(homeLanguage)).append("\n");
    sb.append("    iepStatus: ").append(toIndentedString(iepStatus)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    schools: ").append(toIndentedString(schools)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    studentNumber: ").append(toIndentedString(studentNumber)).append("\n");
    sb.append("    unweightedGpa: ").append(toIndentedString(unweightedGpa)).append("\n");
    sb.append("    weightedGpa: ").append(toIndentedString(weightedGpa)).append("\n");
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

