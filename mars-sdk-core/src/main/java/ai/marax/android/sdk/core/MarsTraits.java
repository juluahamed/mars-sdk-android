package ai.marax.android.sdk.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ai.marax.android.sdk.core.util.Utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MarsTraits {
    @SerializedName("anonymousId")
    private String anonymousId;
    @SerializedName("address")
    private Address address;
    @SerializedName("age")
    private String age;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("company")
    private Company company;
    @SerializedName("createdat")
    private String createdAt;
    @SerializedName("description")
    private String description;
    @SerializedName("email")
    private String email;
    @SerializedName("firstname")
    private String firstName;
    @SerializedName("gender")
    private String gender;
    @SerializedName("userId")
    private String id;
    @SerializedName("lastname")
    private String lastName;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("title")
    private String title;
    @SerializedName("username")
    private String userName;
    @Expose(serialize = false)
    private transient Map<String, Object> extras;

    public MarsTraits() {
        MarsContext MarsContext = MarsElementCache.getCachedContext();
        if (MarsContext != null) this.anonymousId = MarsContext.getDeviceId();
    }

    MarsTraits(String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public MarsTraits(Address address, String age, String birthday, Company company, String createdAt, String description, String email, String firstName, String gender, String id, String lastName, String name, String phone, String title, String userName) {
        this.address = address;
        this.age = age;
        this.birthday = birthday;
        this.company = company;
        this.createdAt = createdAt;
        this.description = description;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public MarsTraits putAddress(Address address) {
        this.address = address;
        return this;
    }

    public MarsTraits putAge(String age) {
        this.age = age;
        return this;
    }

    public MarsTraits putBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public MarsTraits putBirthday(Date birthday) {
        this.birthday = Utils.toDateString(birthday);
        return this;
    }

    public MarsTraits putCompany(Company company) {
        this.company = company;
        return this;
    }

    public MarsTraits putCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MarsTraits putDescription(String description) {
        this.description = description;
        return this;
    }

    public MarsTraits putEmail(String email) {
        this.email = email;
        return this;
    }

    public MarsTraits putFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public MarsTraits putGender(String gender) {
        this.gender = gender;
        return this;
    }

    public MarsTraits putId(String id) {
        this.id = id;
        return this;
    }

    public MarsTraits putLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MarsTraits putName(String name) {
        this.name = name;
        return this;
    }

    public MarsTraits putPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public MarsTraits putTitle(String title) {
        this.title = title;
        return this;
    }

    public MarsTraits putUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public MarsTraits put(String key, Object value) {
        if (this.extras == null) {
            this.extras = new HashMap<>();
        }
        this.extras.put(key, value);
        return this;
    }

    public static class Address {
        @SerializedName("city")
        private String city;
        @SerializedName("country")
        private String country;
        @SerializedName("postalcode")
        private String postalCode;
        @SerializedName("state")
        private String state;
        @SerializedName("street")
        private String street;

        public Address() {
        }

        public Address putCity(String city) {
            this.city = city;
            return this;
        }

        public Address putCountry(String country) {
            this.country = country;
            return this;
        }

        public Address putPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address putState(String state) {
            this.state = state;
            return this;
        }

        public Address putStreet(String street) {
            this.street = street;
            return this;
        }

        public Address(String city, String country, String postalCode, String state, String street) {
            this.city = city;
            this.country = country;
            this.postalCode = postalCode;
            this.state = state;
            this.street = street;
        }
    }

    public static class Company {
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private String id;
        @SerializedName("industry")
        private String industry;

        Company(String name, String id, String industry) {
            this.name = name;
            this.id = id;
            this.industry = industry;
        }

        public Company putName(String name) {
            this.name = name;
            return this;
        }

        public Company putId(String id) {
            this.id = id;
            return this;
        }

        public Company putIndustry(String industry) {
            this.industry = industry;
            return this;
        }
    }
}

