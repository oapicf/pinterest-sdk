# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.14.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  # Object containing other custom data.
  class ConversionEventsDataInnerCustomData
    include JSON::Serializable

    # Optional properties
    # The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    @[JSON::Field(key: "currency", type: String?, nillable: true, emit_null: false)]
    property currency : String?

    # Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    @[JSON::Field(key: "value", type: String?, nillable: true, emit_null: false)]
    property value : String?

    # List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    @[JSON::Field(key: "content_ids", type: Array(String)?, nillable: true, emit_null: false)]
    property content_ids : Array(String)?

    # The name of the page or product associated with the event.
    @[JSON::Field(key: "content_name", type: String?, nillable: true, emit_null: false)]
    property content_name : String?

    # The category of the content associated with the event.
    @[JSON::Field(key: "content_category", type: String?, nillable: true, emit_null: false)]
    property content_category : String?

    # The brand of the content associated with the event.
    @[JSON::Field(key: "content_brand", type: String?, nillable: true, emit_null: false)]
    property content_brand : String?

    # A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    @[JSON::Field(key: "contents", type: Array(ConversionEventsDataInnerCustomDataContentsInner)?, nillable: true, emit_null: false)]
    property contents : Array(ConversionEventsDataInnerCustomDataContentsInner)?

    # Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    @[JSON::Field(key: "num_items", type: Int64?, nillable: true, emit_null: false)]
    property num_items : Int64?

    # The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    @[JSON::Field(key: "order_id", type: String?, nillable: true, emit_null: false)]
    property order_id : String?

    # The search string related to the user conversion event.
    @[JSON::Field(key: "search_string", type: String?, nillable: true, emit_null: false)]
    property search_string : String?

    # Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
    @[JSON::Field(key: "opt_out_type", type: String?, nillable: true, emit_null: false)]
    property opt_out_type : String?

    # Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    @[JSON::Field(key: "np", type: String?, nillable: true, emit_null: false)]
    property np : String?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@currency : String?, @value : String?, @content_ids : Array(String)?, @content_name : String?, @content_category : String?, @content_brand : String?, @contents : Array(ConversionEventsDataInnerCustomDataContentsInner)?, @num_items : Int64?, @order_id : String?, @search_string : String?, @opt_out_type : String?, @np : String?)
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
          currency == o.currency &&
          value == o.value &&
          content_ids == o.content_ids &&
          content_name == o.content_name &&
          content_category == o.content_category &&
          content_brand == o.content_brand &&
          contents == o.contents &&
          num_items == o.num_items &&
          order_id == o.order_id &&
          search_string == o.search_string &&
          opt_out_type == o.opt_out_type &&
          np == o.np
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [currency, value, content_ids, content_name, content_category, content_brand, contents, num_items, order_id, search_string, opt_out_type, np].hash
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
