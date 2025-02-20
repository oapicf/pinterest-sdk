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
  class CampaignResponse
    include JSON::Serializable

    # Optional properties
    # Campaign ID.
    @[JSON::Field(key: "id", type: String?, nillable: true, emit_null: false)]
    property id : String?

    # Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    @[JSON::Field(key: "ad_account_id", type: String?, nillable: true, emit_null: false)]
    property ad_account_id : String?

    # Campaign name.
    @[JSON::Field(key: "name", type: String?, nillable: true, emit_null: false)]
    property name : String?

    @[JSON::Field(key: "status", type: EntityStatus?, nillable: true, emit_null: false)]
    property status : EntityStatus?

    # Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    @[JSON::Field(key: "lifetime_spend_cap", type: Int32?, nillable: true, emit_null: false)]
    property lifetime_spend_cap : Int32?

    # Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    @[JSON::Field(key: "daily_spend_cap", type: Int32?, nillable: true, emit_null: false)]
    property daily_spend_cap : Int32?

    # Order line ID that appears on the invoice.
    @[JSON::Field(key: "order_line_id", type: String?, nillable: true, emit_null: false)]
    property order_line_id : String?

    @[JSON::Field(key: "tracking_urls", type: TrackingUrls?, nillable: true, emit_null: false)]
    property tracking_urls : TrackingUrls?

    # Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    @[JSON::Field(key: "start_time", type: Int32?, nillable: true, emit_null: false)]
    property start_time : Int32?

    # Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    @[JSON::Field(key: "end_time", type: Int32?, nillable: true, emit_null: false)]
    property end_time : Int32?

    # Determine if a campaign has flexible daily budgets setup.
    @[JSON::Field(key: "is_flexible_daily_budgets", type: Bool?, nillable: true, emit_null: false)]
    property is_flexible_daily_budgets : Bool?

    @[JSON::Field(key: "objective_type", type: ObjectiveType?, nillable: true, emit_null: false)]
    property objective_type : ObjectiveType?

    # Campaign creation time. Unix timestamp in seconds.
    @[JSON::Field(key: "created_time", type: Int32?, nillable: true, emit_null: false)]
    property created_time : Int32?

    # UTC timestamp. Last update time.
    @[JSON::Field(key: "updated_time", type: Int32?, nillable: true, emit_null: false)]
    property updated_time : Int32?

    # Always \"campaign\".
    @[JSON::Field(key: "type", type: String?, nillable: true, emit_null: false)]
    property _type : String?

    # Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
    @[JSON::Field(key: "is_campaign_budget_optimization", type: Bool?, nillable: true, emit_null: false)]
    property is_campaign_budget_optimization : Bool?

    @[JSON::Field(key: "summary_status", type: CampaignSummaryStatus?, nillable: true, emit_null: false)]
    property summary_status : CampaignSummaryStatus?

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

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :"CampaignCommon",
      :"CampaignId"
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@id : String?, @ad_account_id : String?, @name : String?, @status : EntityStatus?, @lifetime_spend_cap : Int32?, @daily_spend_cap : Int32?, @order_line_id : String?, @tracking_urls : TrackingUrls?, @start_time : Int32?, @end_time : Int32?, @is_flexible_daily_budgets : Bool?, @objective_type : ObjectiveType?, @created_time : Int32?, @updated_time : Int32?, @_type : String?, @is_campaign_budget_optimization : Bool?, @summary_status : CampaignSummaryStatus?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      pattern = Regexp.new(/^\d+$/)
      if !@id.nil? && @id !~ pattern
        invalid_properties.push("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      pattern = Regexp.new(/^\d+$/)
      if !@ad_account_id.nil? && @ad_account_id !~ pattern
        invalid_properties.push("invalid value for \"ad_account_id\", must conform to the pattern #{pattern}.")
      end

      pattern = Regexp.new(/^\d+$/)
      if !@order_line_id.nil? && @order_line_id !~ pattern
        invalid_properties.push("invalid value for \"order_line_id\", must conform to the pattern #{pattern}.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@id.nil? && @id !~ Regexp.new(/^\d+$/)
      return false if !@ad_account_id.nil? && @ad_account_id !~ Regexp.new(/^\d+$/)
      return false if !@order_line_id.nil? && @order_line_id !~ Regexp.new(/^\d+$/)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      pattern = Regexp.new(/^\d+$/)
      if !id.nil? && id !~ pattern
        raise ArgumentError.new("invalid value for \"id\", must conform to the pattern #{pattern}.")
      end

      @id = id
    end

    # Custom attribute writer method with validation
    # @param [Object] ad_account_id Value to be assigned
    def ad_account_id=(ad_account_id)
      pattern = Regexp.new(/^\d+$/)
      if !ad_account_id.nil? && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\", must conform to the pattern #{pattern}.")
      end

      @ad_account_id = ad_account_id
    end

    # Custom attribute writer method with validation
    # @param [Object] order_line_id Value to be assigned
    def order_line_id=(order_line_id)
      pattern = Regexp.new(/^\d+$/)
      if !order_line_id.nil? && order_line_id !~ pattern
        raise ArgumentError.new("invalid value for \"order_line_id\", must conform to the pattern #{pattern}.")
      end

      @order_line_id = order_line_id
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          id == o.id &&
          ad_account_id == o.ad_account_id &&
          name == o.name &&
          status == o.status &&
          lifetime_spend_cap == o.lifetime_spend_cap &&
          daily_spend_cap == o.daily_spend_cap &&
          order_line_id == o.order_line_id &&
          tracking_urls == o.tracking_urls &&
          start_time == o.start_time &&
          end_time == o.end_time &&
          is_flexible_daily_budgets == o.is_flexible_daily_budgets &&
          objective_type == o.objective_type &&
          created_time == o.created_time &&
          updated_time == o.updated_time &&
          _type == o._type &&
          is_campaign_budget_optimization == o.is_campaign_budget_optimization &&
          summary_status == o.summary_status
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [id, ad_account_id, name, status, lifetime_spend_cap, daily_spend_cap, order_line_id, tracking_urls, start_time, end_time, is_flexible_daily_budgets, objective_type, created_time, updated_time, _type, is_campaign_budget_optimization, summary_status].hash
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
