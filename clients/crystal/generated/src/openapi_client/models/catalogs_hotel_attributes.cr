# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.12.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class CatalogsHotelAttributes
    include JSON::Serializable

    # Optional properties
    # The hotel's name.
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    # Link to the product page
    @[JSON::Field(key: "link", type: String?, nillable: true, emit_null: false)]
    property link : String?

    # Brief description of the hotel.
    @[JSON::Field(key: "description", type: String?, nillable: true, emit_null: false)]
    property description : String?

    # The brand to which this hotel belongs to.
    @[JSON::Field(key: "brand", type: String?, nillable: true, emit_null: false)]
    property brand : String?

    # Latitude of the hotel.
    @[JSON::Field(key: "latitude", type: Float64?, nillable: true, emit_null: false)]
    property latitude : Float64?

    # Longitude of the hotel.
    @[JSON::Field(key: "longitude", type: Float64?, nillable: true, emit_null: false)]
    property longitude : Float64?

    # A list of neighborhoods where the hotel is located
    @[JSON::Field(key: "neighborhood", type: Array(String)?, nillable: true, emit_null: false)]
    property neighborhood : Array(String)?

    @[JSON::Field(key: "address", type: CatalogsHotelAddress?, nillable: true, emit_null: false)]
    property address : CatalogsHotelAddress?

    # Custom grouping of hotels
    @[JSON::Field(key: "custom_label_0", type: String?, nillable: true, emit_null: false)]
    property custom_label_0 : String?

    # Custom grouping of hotels
    @[JSON::Field(key: "custom_label_1", type: String?, nillable: true, emit_null: false)]
    property custom_label_1 : String?

    # Custom grouping of hotels
    @[JSON::Field(key: "custom_label_2", type: String?, nillable: true, emit_null: false)]
    property custom_label_2 : String?

    # Custom grouping of hotels
    @[JSON::Field(key: "custom_label_3", type: String?, nillable: true, emit_null: false)]
    property custom_label_3 : String?

    # Custom grouping of hotels
    @[JSON::Field(key: "custom_label_4", type: String?, nillable: true, emit_null: false)]
    property custom_label_4 : String?

    # The type of property. The category can be any type of internal description desired.
    @[JSON::Field(key: "category", type: String?, nillable: true, emit_null: false)]
    property category : String?

    # Base price of the hotel room per night followed by the ISO currency code
    @[JSON::Field(key: "base_price", type: String?, nillable: true, emit_null: false)]
    property base_price : String?

    # Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
    @[JSON::Field(key: "sale_price", type: String?, nillable: true, emit_null: false)]
    property sale_price : String?

    @[JSON::Field(key: "guest_ratings", type: CatalogsHotelGuestRatings?, nillable: true, emit_null: false)]
    property guest_ratings : CatalogsHotelGuestRatings?

    @[JSON::Field(key: "main_image", type: CatalogsHotelAttributesAllOfMainImage?, nillable: true, emit_null: false)]
    property main_image : CatalogsHotelAttributesAllOfMainImage?

    # <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
    @[JSON::Field(key: "additional_image_link", type: Array(String)?, nillable: true, emit_null: false)]
    property additional_image_link : Array(String)?

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :"CatalogsUpdatableHotelAttributes"
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@name : String?, @link : String?, @description : String?, @brand : String?, @latitude : Float64?, @longitude : Float64?, @neighborhood : Array(String)?, @address : CatalogsHotelAddress?, @custom_label_0 : String?, @custom_label_1 : String?, @custom_label_2 : String?, @custom_label_3 : String?, @custom_label_4 : String?, @category : String?, @base_price : String?, @sale_price : String?, @guest_ratings : CatalogsHotelGuestRatings?, @main_image : CatalogsHotelAttributesAllOfMainImage?, @additional_image_link : Array(String)?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          name == o.name &&
          link == o.link &&
          description == o.description &&
          brand == o.brand &&
          latitude == o.latitude &&
          longitude == o.longitude &&
          neighborhood == o.neighborhood &&
          address == o.address &&
          custom_label_0 == o.custom_label_0 &&
          custom_label_1 == o.custom_label_1 &&
          custom_label_2 == o.custom_label_2 &&
          custom_label_3 == o.custom_label_3 &&
          custom_label_4 == o.custom_label_4 &&
          category == o.category &&
          base_price == o.base_price &&
          sale_price == o.sale_price &&
          guest_ratings == o.guest_ratings &&
          main_image == o.main_image &&
          additional_image_link == o.additional_image_link
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [name, link, description, brand, latitude, longitude, neighborhood, address, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, category, base_price, sale_price, guest_ratings, main_image, additional_image_link].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end