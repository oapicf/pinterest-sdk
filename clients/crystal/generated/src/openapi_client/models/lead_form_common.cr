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
  # Creation fields
  class LeadFormCommon
    include JSON::Serializable

    # Optional properties
    # Internal name of the lead form.
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    # A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    @[JSON::Field(key: "privacy_policy_link", type: String?, nillable: true, emit_null: false)]
    property privacy_policy_link : String?

    # Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
    @[JSON::Field(key: "has_accepted_terms", type: Bool?, nillable: true, emit_null: false)]
    property has_accepted_terms : Bool?

    # A message for people who complete the form to let them know what happens next.
    @[JSON::Field(key: "completion_message", type: String?, nillable: true, emit_null: false)]
    property completion_message : String?

    @[JSON::Field(key: "status", type: LeadFormStatus?, nillable: true, emit_null: false)]
    property status : LeadFormStatus?

    # Additional disclosure language to be included in the lead form.
    @[JSON::Field(key: "disclosure_language", type: String?, nillable: true, emit_null: false)]
    property disclosure_language : String?

    # List of questions to be displayed on the lead form.
    @[JSON::Field(key: "questions", type: Array(LeadFormQuestion)?, nillable: true, emit_null: false)]
    property questions : Array(LeadFormQuestion)?

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
    def initialize(@name : String?, @privacy_policy_link : String?, @has_accepted_terms : Bool?, @completion_message : String?, @status : LeadFormStatus?, @disclosure_language : String?, @questions : Array(LeadFormQuestion)?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@questions.nil? && @questions.size > 10
        invalid_properties.push("invalid value for \"questions\", number of items must be less than or equal to 10."
      end

      if !@questions.nil? && @questions.size < 0
        invalid_properties.push("invalid value for \"questions\", number of items must be greater than or equal to 0."
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@questions.nil? && @questions.size > 10
      return false if !@questions.nil? && @questions.size < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] questions Value to be assigned
    def questions=(questions)
      if !questions.nil? && questions.size > 10
        raise ArgumentError.new("invalid value for \"questions\", number of items must be less than or equal to 10.")
      end

      if !questions.nil? && questions.size < 0
        raise ArgumentError.new("invalid value for \"questions\", number of items must be greater than or equal to 0.")
      end

      @questions = questions
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          name == o.name &&
          privacy_policy_link == o.privacy_policy_link &&
          has_accepted_terms == o.has_accepted_terms &&
          completion_message == o.completion_message &&
          status == o.status &&
          disclosure_language == o.disclosure_language &&
          questions == o.questions
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [name, privacy_policy_link, has_accepted_terms, completion_message, status, disclosure_language, questions].hash
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