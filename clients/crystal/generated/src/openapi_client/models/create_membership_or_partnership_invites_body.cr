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
  # Body to be used on path to send Members or Partners Invite or Request
  class CreateMembershipOrPartnershipInvitesBody
    include JSON::Serializable

    # Required properties
    # The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
    @[JSON::Field(key: "business_role", type: String, nillable: false, emit_null: false)]
    property business_role : String

    @[JSON::Field(key: "invite_type", type: InviteType, nillable: false, emit_null: false)]
    property invite_type : InviteType

    # Optional properties
    # A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
    @[JSON::Field(key: "members", type: Array(String)?, nillable: true, emit_null: false)]
    property members : Array(String)?

    # A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
    @[JSON::Field(key: "partners", type: Array(String)?, nillable: true, emit_null: false)]
    property partners : Array(String)?

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
    def initialize(@business_role : String, @invite_type : InviteType, @members : Array(String)?, @partners : Array(String)?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@members.nil? && @members.size > 50
        invalid_properties.push("invalid value for \"members\", number of items must be less than or equal to 50."
      end

      if !@members.nil? && @members.size < 1
        invalid_properties.push("invalid value for \"members\", number of items must be greater than or equal to 1."
      end

      if !@partners.nil? && @partners.size > 50
        invalid_properties.push("invalid value for \"partners\", number of items must be less than or equal to 50."
      end

      if !@partners.nil? && @partners.size < 1
        invalid_properties.push("invalid value for \"partners\", number of items must be greater than or equal to 1."
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      business_role_validator = EnumAttributeValidator.new("String", ["EMPLOYEE", "BIZ_ADMIN", "PARTNER"])
      return false unless business_role_validator.valid?(@business_role)
      return false if !@members.nil? && @members.size > 50
      return false if !@members.nil? && @members.size < 1
      return false if !@partners.nil? && @partners.size > 50
      return false if !@partners.nil? && @partners.size < 1
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] business_role Object to be assigned
    def business_role=(business_role)
      validator = EnumAttributeValidator.new("String", ["EMPLOYEE", "BIZ_ADMIN", "PARTNER"])
      unless validator.valid?(business_role)
        raise ArgumentError.new("invalid value for \"business_role\", must be one of #{validator.allowable_values}.")
      end
      @business_role = business_role
    end

    # Custom attribute writer method with validation
    # @param [Object] members Value to be assigned
    def members=(members)
      if !members.nil? && members.size > 50
        raise ArgumentError.new("invalid value for \"members\", number of items must be less than or equal to 50.")
      end

      if !members.nil? && members.size < 1
        raise ArgumentError.new("invalid value for \"members\", number of items must be greater than or equal to 1.")
      end

      @members = members
    end

    # Custom attribute writer method with validation
    # @param [Object] partners Value to be assigned
    def partners=(partners)
      if !partners.nil? && partners.size > 50
        raise ArgumentError.new("invalid value for \"partners\", number of items must be less than or equal to 50.")
      end

      if !partners.nil? && partners.size < 1
        raise ArgumentError.new("invalid value for \"partners\", number of items must be greater than or equal to 1.")
      end

      @partners = partners
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          business_role == o.business_role &&
          invite_type == o.invite_type &&
          members == o.members &&
          partners == o.partners
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [business_role, invite_type, members, partners].hash
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
