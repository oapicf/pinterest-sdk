//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PromotionResponse {
  /// Returns a new [PromotionResponse] instance.
  PromotionResponse({
    this.discountStatus,
    this.endTime,
    this.externalId,
    this.platformType,
    this.promotionCode,
    this.promotionCustomId,
    this.promotionTitle,
    this.promotionType,
    this.startTime,
    this.templateValues = const [],
    this.adAccountId,
    this.id,
    this.status,
  });

  /// Discount status based on the current time and start and end time of discount
  PromotionResponseDiscountStatusEnum? discountStatus;

  /// Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? endTime;

  /// Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? externalId;

  /// The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? platformType;

  /// Code that can be used to redeem a promotion.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promotionCode;

  /// An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promotionCustomId;

  /// Internal name for the promotion.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promotionTitle;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PromotionType? promotionType;

  /// Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startTime;

  /// List of values to be inserted in the promotion type-specific template.
  List<PromotionTemplateValue> templateValues;

  /// The Ad Account ID that this promotion belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Promotion ID
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PromotionResponse &&
    other.discountStatus == discountStatus &&
    other.endTime == endTime &&
    other.externalId == externalId &&
    other.platformType == platformType &&
    other.promotionCode == promotionCode &&
    other.promotionCustomId == promotionCustomId &&
    other.promotionTitle == promotionTitle &&
    other.promotionType == promotionType &&
    other.startTime == startTime &&
    _deepEquality.equals(other.templateValues, templateValues) &&
    other.adAccountId == adAccountId &&
    other.id == id &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (discountStatus == null ? 0 : discountStatus!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (externalId == null ? 0 : externalId!.hashCode) +
    (platformType == null ? 0 : platformType!.hashCode) +
    (promotionCode == null ? 0 : promotionCode!.hashCode) +
    (promotionCustomId == null ? 0 : promotionCustomId!.hashCode) +
    (promotionTitle == null ? 0 : promotionTitle!.hashCode) +
    (promotionType == null ? 0 : promotionType!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (templateValues.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'PromotionResponse[discountStatus=$discountStatus, endTime=$endTime, externalId=$externalId, platformType=$platformType, promotionCode=$promotionCode, promotionCustomId=$promotionCustomId, promotionTitle=$promotionTitle, promotionType=$promotionType, startTime=$startTime, templateValues=$templateValues, adAccountId=$adAccountId, id=$id, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.discountStatus != null) {
      json[r'discount_status'] = this.discountStatus;
    } else {
      json[r'discount_status'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
    if (this.externalId != null) {
      json[r'external_id'] = this.externalId;
    } else {
      json[r'external_id'] = null;
    }
    if (this.platformType != null) {
      json[r'platform_type'] = this.platformType;
    } else {
      json[r'platform_type'] = null;
    }
    if (this.promotionCode != null) {
      json[r'promotion_code'] = this.promotionCode;
    } else {
      json[r'promotion_code'] = null;
    }
    if (this.promotionCustomId != null) {
      json[r'promotion_custom_id'] = this.promotionCustomId;
    } else {
      json[r'promotion_custom_id'] = null;
    }
    if (this.promotionTitle != null) {
      json[r'promotion_title'] = this.promotionTitle;
    } else {
      json[r'promotion_title'] = null;
    }
    if (this.promotionType != null) {
      json[r'promotion_type'] = this.promotionType;
    } else {
      json[r'promotion_type'] = null;
    }
    if (this.startTime != null) {
      json[r'start_time'] = this.startTime;
    } else {
      json[r'start_time'] = null;
    }
      json[r'template_values'] = this.templateValues;
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [PromotionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PromotionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PromotionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PromotionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PromotionResponse(
        discountStatus: PromotionResponseDiscountStatusEnum.fromJson(json[r'discount_status']),
        endTime: mapValueOfType<int>(json, r'end_time'),
        externalId: mapValueOfType<String>(json, r'external_id'),
        platformType: mapValueOfType<String>(json, r'platform_type'),
        promotionCode: mapValueOfType<String>(json, r'promotion_code'),
        promotionCustomId: mapValueOfType<String>(json, r'promotion_custom_id'),
        promotionTitle: mapValueOfType<String>(json, r'promotion_title'),
        promotionType: PromotionType.fromJson(json[r'promotion_type']),
        startTime: mapValueOfType<int>(json, r'start_time'),
        templateValues: PromotionTemplateValue.listFromJson(json[r'template_values']),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        id: mapValueOfType<String>(json, r'id'),
        status: EntityStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<PromotionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromotionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromotionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PromotionResponse> mapFromJson(dynamic json) {
    final map = <String, PromotionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PromotionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PromotionResponse-objects as value to a dart map
  static Map<String, List<PromotionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PromotionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PromotionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Discount status based on the current time and start and end time of discount
class PromotionResponseDiscountStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const PromotionResponseDiscountStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OTHER = PromotionResponseDiscountStatusEnum._(r'OTHER');
  static const ACTIVE = PromotionResponseDiscountStatusEnum._(r'ACTIVE');
  static const PAUSED = PromotionResponseDiscountStatusEnum._(r'PAUSED');
  static const SCHEDULED = PromotionResponseDiscountStatusEnum._(r'SCHEDULED');
  static const EXPIRED = PromotionResponseDiscountStatusEnum._(r'EXPIRED');

  /// List of all possible values in this [enum][PromotionResponseDiscountStatusEnum].
  static const values = <PromotionResponseDiscountStatusEnum>[
    OTHER,
    ACTIVE,
    PAUSED,
    SCHEDULED,
    EXPIRED,
  ];

  static PromotionResponseDiscountStatusEnum? fromJson(dynamic value) => PromotionResponseDiscountStatusEnumTypeTransformer().decode(value);

  static List<PromotionResponseDiscountStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromotionResponseDiscountStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromotionResponseDiscountStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromotionResponseDiscountStatusEnum] to String,
/// and [decode] dynamic data back to [PromotionResponseDiscountStatusEnum].
class PromotionResponseDiscountStatusEnumTypeTransformer {
  factory PromotionResponseDiscountStatusEnumTypeTransformer() => _instance ??= const PromotionResponseDiscountStatusEnumTypeTransformer._();

  const PromotionResponseDiscountStatusEnumTypeTransformer._();

  String encode(PromotionResponseDiscountStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PromotionResponseDiscountStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromotionResponseDiscountStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OTHER': return PromotionResponseDiscountStatusEnum.OTHER;
        case r'ACTIVE': return PromotionResponseDiscountStatusEnum.ACTIVE;
        case r'PAUSED': return PromotionResponseDiscountStatusEnum.PAUSED;
        case r'SCHEDULED': return PromotionResponseDiscountStatusEnum.SCHEDULED;
        case r'EXPIRED': return PromotionResponseDiscountStatusEnum.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromotionResponseDiscountStatusEnumTypeTransformer] instance.
  static PromotionResponseDiscountStatusEnumTypeTransformer? _instance;
}


