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
  class CustomerList
    include JSON::Serializable

    # Optional properties
    # Associated ad account ID.
    @[JSON::Field(key: "ad_account_id", type: String?, nillable: true, emit_null: false)]
    property ad_account_id : String?

    # Creation time. Unix timestamp in seconds.
    @[JSON::Field(key: "created_time", type: Float64?, nillable: true, emit_null: false)]
    property created_time : Float64?

    # Customer list ID.
    @[JSON::Field(key: "id", type: String?, nillable: true, emit_null: false)]
    property id : String?

    # Customer list name.
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    # Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    @[JSON::Field(key: "num_batches", type: Float64?, nillable: true, emit_null: false)]
    property num_batches : Float64?

    # Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
    @[JSON::Field(key: "num_removed_user_records", type: Float64?, nillable: true, emit_null: false)]
    property num_removed_user_records : Float64?

    # Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
    @[JSON::Field(key: "num_uploaded_user_records", type: Float64?, nillable: true, emit_null: false)]
    property num_uploaded_user_records : Float64?

    # Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    @[JSON::Field(key: "status", type: String?, nillable: true, emit_null: false)]
    property status : String?

    # Always \"customerlist\".
    @[JSON::Field(key: "type", type: String?, nillable: true, emit_null: false)]
    property _type : String?

    # Last update time. Unix timestamp in seconds.
    @[JSON::Field(key: "updated_time", type: Float64?, nillable: true, emit_null: false)]
    property updated_time : Float64?

    # Customer list errors
    @[JSON::Field(key: "exceptions", type: Object?, nillable: true, emit_null: false)]
    property exceptions : Object?

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
    def initialize(@ad_account_id : String?, @created_time : Float64?, @id : String?, @name : String?, @num_batches : Float64?, @num_removed_user_records : Float64?, @num_uploaded_user_records : Float64?, @status : String?, @_type : String?, @updated_time : Float64?, @exceptions : Object?)
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
      status_validator = EnumAttributeValidator.new("String", ["PROCESSING", "READY", "TOO_SMALL", "UPLOADING"])
      return false unless status_validator.valid?(@status)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] status Object to be assigned
    def status=(status)
      validator = EnumAttributeValidator.new("String", ["PROCESSING", "READY", "TOO_SMALL", "UPLOADING"])
      unless validator.valid?(status)
        raise ArgumentError.new("invalid value for \"status\", must be one of #{validator.allowable_values}.")
      end
      @status = status
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          ad_account_id == o.ad_account_id &&
          created_time == o.created_time &&
          id == o.id &&
          name == o.name &&
          num_batches == o.num_batches &&
          num_removed_user_records == o.num_removed_user_records &&
          num_uploaded_user_records == o.num_uploaded_user_records &&
          status == o.status &&
          _type == o._type &&
          updated_time == o.updated_time &&
          exceptions == o.exceptions
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [ad_account_id, created_time, id, name, num_batches, num_removed_user_records, num_uploaded_user_records, status, _type, updated_time, exceptions].hash
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