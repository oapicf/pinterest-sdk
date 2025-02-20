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
  # Schema for log sent from an integration application.
  class IntegrationLog
    include JSON::Serializable

    # Required properties
    # Timestamp in milliseconds of when the log was executed at the client.
    @[JSON::Field(key: "client_timestamp", type: Int32, nillable: false, emit_null: false)]
    property client_timestamp : Int32

    # Log event type
    @[JSON::Field(key: "event_type", type: String, nillable: false, emit_null: false)]
    property event_type : String

    # Log level type
    @[JSON::Field(key: "log_level", type: String, nillable: false, emit_null: false)]
    property log_level : String

    # Optional properties
    @[JSON::Field(key: "external_business_id", type: String?, nillable: true, emit_null: false)]
    property external_business_id : String?

    @[JSON::Field(key: "advertiser_id", type: String?, nillable: true, emit_null: false)]
    property advertiser_id : String?

    @[JSON::Field(key: "merchant_id", type: String?, nillable: true, emit_null: false)]
    property merchant_id : String?

    @[JSON::Field(key: "tag_id", type: String?, nillable: true, emit_null: false)]
    property tag_id : String?

    @[JSON::Field(key: "feed_profile_id", type: String?, nillable: true, emit_null: false)]
    property feed_profile_id : String?

    # Explanation of the event that occured.
    @[JSON::Field(key: "message", type: String?, nillable: true, emit_null: false)]
    property message : String?

    # Version number of the integration application.
    @[JSON::Field(key: "app_version_number", type: String?, nillable: true, emit_null: false)]
    property app_version_number : String?

    # Version number of the platform the integration application is running on.
    @[JSON::Field(key: "platform_version_number", type: String?, nillable: true, emit_null: false)]
    property platform_version_number : String?

    @[JSON::Field(key: "error", type: IntegrationLogClientError?, nillable: true, emit_null: false)]
    property error : IntegrationLogClientError?

    @[JSON::Field(key: "request", type: IntegrationLogClientRequest?, nillable: true, emit_null: false)]
    property request : IntegrationLogClientRequest?

    class EnumAttributeValidator
      getter datatype : String
      getter allowable_values : Array(String)

      def initialize(datatype, allowable_values)
        @datatype = datatype
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.includes?(value)
      end
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@client_timestamp : Int32, @event_type : String, @log_level : String, @external_business_id : String?, @advertiser_id : String?, @merchant_id : String?, @tag_id : String?, @feed_profile_id : String?, @message : String?, @app_version_number : String?, @platform_version_number : String?, @error : IntegrationLogClientError?, @request : IntegrationLogClientRequest?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@external_business_id.nil? && @external_business_id.to_s.size > 2048
        invalid_properties.push("invalid value for \"external_business_id\", the character length must be smaller than or equal to 2048.")
      end

      if !@advertiser_id.nil? && @advertiser_id.to_s.size > 128
        invalid_properties.push("invalid value for \"advertiser_id\", the character length must be smaller than or equal to 128.")
      end

      if !@merchant_id.nil? && @merchant_id.to_s.size > 128
        invalid_properties.push("invalid value for \"merchant_id\", the character length must be smaller than or equal to 128.")
      end

      if !@tag_id.nil? && @tag_id.to_s.size > 128
        invalid_properties.push("invalid value for \"tag_id\", the character length must be smaller than or equal to 128.")
      end

      if !@feed_profile_id.nil? && @feed_profile_id.to_s.size > 128
        invalid_properties.push("invalid value for \"feed_profile_id\", the character length must be smaller than or equal to 128.")
      end

      if !@message.nil? && @message.to_s.size > 2048
        invalid_properties.push("invalid value for \"message\", the character length must be smaller than or equal to 2048.")
      end

      if !@app_version_number.nil? && @app_version_number.to_s.size > 20
        invalid_properties.push("invalid value for \"app_version_number\", the character length must be smaller than or equal to 20.")
      end

      if !@platform_version_number.nil? && @platform_version_number.to_s.size > 20
        invalid_properties.push("invalid value for \"platform_version_number\", the character length must be smaller than or equal to 20.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      event_type_validator = EnumAttributeValidator.new("String", ["APP", "API"])
      return false unless event_type_validator.valid?(@event_type)
      log_level_validator = EnumAttributeValidator.new("String", ["INFO", "WARN", "ERROR"])
      return false unless log_level_validator.valid?(@log_level)
      return false if !@external_business_id.nil? && @external_business_id.to_s.size > 2048
      return false if !@advertiser_id.nil? && @advertiser_id.to_s.size > 128
      return false if !@merchant_id.nil? && @merchant_id.to_s.size > 128
      return false if !@tag_id.nil? && @tag_id.to_s.size > 128
      return false if !@feed_profile_id.nil? && @feed_profile_id.to_s.size > 128
      return false if !@message.nil? && @message.to_s.size > 2048
      return false if !@app_version_number.nil? && @app_version_number.to_s.size > 20
      return false if !@platform_version_number.nil? && @platform_version_number.to_s.size > 20
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] event_type Object to be assigned
    def event_type=(event_type)
      validator = EnumAttributeValidator.new("String", ["APP", "API"])
      unless validator.valid?(event_type)
        raise ArgumentError.new("invalid value for \"event_type\", must be one of #{validator.allowable_values}.")
      end
      @event_type = event_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] log_level Object to be assigned
    def log_level=(log_level)
      validator = EnumAttributeValidator.new("String", ["INFO", "WARN", "ERROR"])
      unless validator.valid?(log_level)
        raise ArgumentError.new("invalid value for \"log_level\", must be one of #{validator.allowable_values}.")
      end
      @log_level = log_level
    end

    # Custom attribute writer method with validation
    # @param [Object] external_business_id Value to be assigned
    def external_business_id=(external_business_id)
      if !external_business_id.nil? && external_business_id.to_s.size > 2048
        raise ArgumentError.new("invalid value for \"external_business_id\", the character length must be smaller than or equal to 2048.")
      end

      @external_business_id = external_business_id
    end

    # Custom attribute writer method with validation
    # @param [Object] advertiser_id Value to be assigned
    def advertiser_id=(advertiser_id)
      if !advertiser_id.nil? && advertiser_id.to_s.size > 128
        raise ArgumentError.new("invalid value for \"advertiser_id\", the character length must be smaller than or equal to 128.")
      end

      @advertiser_id = advertiser_id
    end

    # Custom attribute writer method with validation
    # @param [Object] merchant_id Value to be assigned
    def merchant_id=(merchant_id)
      if !merchant_id.nil? && merchant_id.to_s.size > 128
        raise ArgumentError.new("invalid value for \"merchant_id\", the character length must be smaller than or equal to 128.")
      end

      @merchant_id = merchant_id
    end

    # Custom attribute writer method with validation
    # @param [Object] tag_id Value to be assigned
    def tag_id=(tag_id)
      if !tag_id.nil? && tag_id.to_s.size > 128
        raise ArgumentError.new("invalid value for \"tag_id\", the character length must be smaller than or equal to 128.")
      end

      @tag_id = tag_id
    end

    # Custom attribute writer method with validation
    # @param [Object] feed_profile_id Value to be assigned
    def feed_profile_id=(feed_profile_id)
      if !feed_profile_id.nil? && feed_profile_id.to_s.size > 128
        raise ArgumentError.new("invalid value for \"feed_profile_id\", the character length must be smaller than or equal to 128.")
      end

      @feed_profile_id = feed_profile_id
    end

    # Custom attribute writer method with validation
    # @param [Object] message Value to be assigned
    def message=(message)
      if !message.nil? && message.to_s.size > 2048
        raise ArgumentError.new("invalid value for \"message\", the character length must be smaller than or equal to 2048.")
      end

      @message = message
    end

    # Custom attribute writer method with validation
    # @param [Object] app_version_number Value to be assigned
    def app_version_number=(app_version_number)
      if !app_version_number.nil? && app_version_number.to_s.size > 20
        raise ArgumentError.new("invalid value for \"app_version_number\", the character length must be smaller than or equal to 20.")
      end

      @app_version_number = app_version_number
    end

    # Custom attribute writer method with validation
    # @param [Object] platform_version_number Value to be assigned
    def platform_version_number=(platform_version_number)
      if !platform_version_number.nil? && platform_version_number.to_s.size > 20
        raise ArgumentError.new("invalid value for \"platform_version_number\", the character length must be smaller than or equal to 20.")
      end

      @platform_version_number = platform_version_number
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          client_timestamp == o.client_timestamp &&
          event_type == o.event_type &&
          log_level == o.log_level &&
          external_business_id == o.external_business_id &&
          advertiser_id == o.advertiser_id &&
          merchant_id == o.merchant_id &&
          tag_id == o.tag_id &&
          feed_profile_id == o.feed_profile_id &&
          message == o.message &&
          app_version_number == o.app_version_number &&
          platform_version_number == o.platform_version_number &&
          error == o.error &&
          request == o.request
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [client_timestamp, event_type, log_level, external_business_id, advertiser_id, merchant_id, tag_id, feed_profile_id, message, app_version_number, platform_version_number, error, request].hash
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
