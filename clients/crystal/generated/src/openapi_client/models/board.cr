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
  # Board
  class Board
    include JSON::Serializable

    # Required properties
    @[JSON::Field(key: "name", type: String, nillable: false, emit_null: false)]
    property name : String

    # Optional properties
    @[JSON::Field(key: "id", type: String?, nillable: true, emit_null: false)]
    property id : String?

    # Date and time of board creation.
    @[JSON::Field(key: "created_at", type: Time?, nillable: true, emit_null: false)]
    property created_at : Time?

    # Date and time of last board pins modified.
    @[JSON::Field(key: "board_pins_modified_at", type: Time?, nillable: true, emit_null: false)]
    property board_pins_modified_at : Time?

    @[JSON::Field(key: "description", type: String?, nillable: true, emit_null: false)]
    property description : String?

    # Count of collaborators on the board.
    @[JSON::Field(key: "collaborator_count", type: Int32?, nillable: true, emit_null: false)]
    property collaborator_count : Int32?

    # Count of pins on the board.
    @[JSON::Field(key: "pin_count", type: Int32?, nillable: true, emit_null: false)]
    property pin_count : Int32?

    # Board follower count.
    @[JSON::Field(key: "follower_count", type: Int32?, nillable: true, emit_null: false)]
    property follower_count : Int32?

    @[JSON::Field(key: "media", type: BoardMedia?, nillable: true, emit_null: false)]
    property media : BoardMedia?

    @[JSON::Field(key: "owner", type: BoardOwner?, nillable: true, emit_null: false)]
    property owner : BoardOwner?

    # Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
    @[JSON::Field(key: "privacy", type: String?, default: "PUBLIC", nillable: true, emit_null: false)]
    property privacy : String?

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
    def initialize(@name : String, @id : String?, @created_at : Time?, @board_pins_modified_at : Time?, @description : String?, @collaborator_count : Int32?, @pin_count : Int32?, @follower_count : Int32?, @media : BoardMedia?, @owner : BoardOwner?, @privacy : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@collaborator_count.nil? && @collaborator_count < 0
        invalid_properties.push("invalid value for \"collaborator_count\", must be greater than or equal to 0.")
      end

      if !@pin_count.nil? && @pin_count < 0
        invalid_properties.push("invalid value for \"pin_count\", must be greater than or equal to 0.")
      end

      if !@follower_count.nil? && @follower_count < 0
        invalid_properties.push("invalid value for \"follower_count\", must be greater than or equal to 0.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@collaborator_count.nil? && @collaborator_count < 0
      return false if !@pin_count.nil? && @pin_count < 0
      return false if !@follower_count.nil? && @follower_count < 0
      privacy_validator = EnumAttributeValidator.new("String", ["PUBLIC", "PROTECTED", "SECRET"])
      return false unless privacy_validator.valid?(@privacy)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] collaborator_count Value to be assigned
    def collaborator_count=(collaborator_count)
      if !collaborator_count.nil? && collaborator_count < 0
        raise ArgumentError.new("invalid value for \"collaborator_count\", must be greater than or equal to 0.")
      end

      @collaborator_count = collaborator_count
    end

    # Custom attribute writer method with validation
    # @param [Object] pin_count Value to be assigned
    def pin_count=(pin_count)
      if !pin_count.nil? && pin_count < 0
        raise ArgumentError.new("invalid value for \"pin_count\", must be greater than or equal to 0.")
      end

      @pin_count = pin_count
    end

    # Custom attribute writer method with validation
    # @param [Object] follower_count Value to be assigned
    def follower_count=(follower_count)
      if !follower_count.nil? && follower_count < 0
        raise ArgumentError.new("invalid value for \"follower_count\", must be greater than or equal to 0.")
      end

      @follower_count = follower_count
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] privacy Object to be assigned
    def privacy=(privacy)
      validator = EnumAttributeValidator.new("String", ["PUBLIC", "PROTECTED", "SECRET"])
      unless validator.valid?(privacy)
        raise ArgumentError.new("invalid value for \"privacy\", must be one of #{validator.allowable_values}.")
      end
      @privacy = privacy
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          id == o.id &&
          created_at == o.created_at &&
          board_pins_modified_at == o.board_pins_modified_at &&
          name == o.name &&
          description == o.description &&
          collaborator_count == o.collaborator_count &&
          pin_count == o.pin_count &&
          follower_count == o.follower_count &&
          media == o.media &&
          owner == o.owner &&
          privacy == o.privacy
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [id, created_at, board_pins_modified_at, name, description, collaborator_count, pin_count, follower_count, media, owner, privacy].hash
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