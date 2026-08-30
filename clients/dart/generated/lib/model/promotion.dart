//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Promotion {
  /// Returns a new [Promotion] instance.
  Promotion({
    required this.adAccountId,
    this.discountStatus,
    this.endTime,
    this.externalId,
    required this.id,
    this.platformType,
    this.promotionCode,
    this.promotionCustomId,
    required this.promotionTitle,
    required this.promotionType,
    this.startTime,
    this.status,
    this.templateValues = const [],
  });

  /// The Ad Account ID that this promotion belongs to.
  String adAccountId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DiscountStatus? discountStatus;

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

  /// Promotion ID
  String id;

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
  String promotionTitle;

  PromotionType promotionType;

  /// Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  /// List of values to be inserted in the promotion type-specific template.
  List<PromotionTemplateValue> templateValues;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Promotion &&
    other.adAccountId == adAccountId &&
    other.discountStatus == discountStatus &&
    other.endTime == endTime &&
    other.externalId == externalId &&
    other.id == id &&
    other.platformType == platformType &&
    other.promotionCode == promotionCode &&
    other.promotionCustomId == promotionCustomId &&
    other.promotionTitle == promotionTitle &&
    other.promotionType == promotionType &&
    other.startTime == startTime &&
    other.status == status &&
    _deepEquality.equals(other.templateValues, templateValues);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId.hashCode) +
    (discountStatus == null ? 0 : discountStatus!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (externalId == null ? 0 : externalId!.hashCode) +
    (id.hashCode) +
    (platformType == null ? 0 : platformType!.hashCode) +
    (promotionCode == null ? 0 : promotionCode!.hashCode) +
    (promotionCustomId == null ? 0 : promotionCustomId!.hashCode) +
    (promotionTitle.hashCode) +
    (promotionType.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (templateValues.hashCode);

  @override
  String toString() => 'Promotion[adAccountId=$adAccountId, discountStatus=$discountStatus, endTime=$endTime, externalId=$externalId, id=$id, platformType=$platformType, promotionCode=$promotionCode, promotionCustomId=$promotionCustomId, promotionTitle=$promotionTitle, promotionType=$promotionType, startTime=$startTime, status=$status, templateValues=$templateValues]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_account_id'] = this.adAccountId;
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
      json[r'id'] = this.id;
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
      json[r'promotion_title'] = this.promotionTitle;
      json[r'promotion_type'] = this.promotionType;
    if (this.startTime != null) {
      json[r'start_time'] = this.startTime;
    } else {
      json[r'start_time'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'template_values'] = this.templateValues;
    return json;
  }

  /// Returns a new [Promotion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Promotion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_account_id'), 'Required key "Promotion[ad_account_id]" is missing from JSON.');
        assert(json[r'ad_account_id'] != null, 'Required key "Promotion[ad_account_id]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "Promotion[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Promotion[id]" has a null value in JSON.');
        assert(json.containsKey(r'promotion_title'), 'Required key "Promotion[promotion_title]" is missing from JSON.');
        assert(json[r'promotion_title'] != null, 'Required key "Promotion[promotion_title]" has a null value in JSON.');
        assert(json.containsKey(r'promotion_type'), 'Required key "Promotion[promotion_type]" is missing from JSON.');
        assert(json[r'promotion_type'] != null, 'Required key "Promotion[promotion_type]" has a null value in JSON.');
        return true;
      }());

      return Promotion(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id')!,
        discountStatus: DiscountStatus.fromJson(json[r'discount_status']),
        endTime: mapValueOfType<int>(json, r'end_time'),
        externalId: mapValueOfType<String>(json, r'external_id'),
        id: mapValueOfType<String>(json, r'id')!,
        platformType: mapValueOfType<String>(json, r'platform_type'),
        promotionCode: mapValueOfType<String>(json, r'promotion_code'),
        promotionCustomId: mapValueOfType<String>(json, r'promotion_custom_id'),
        promotionTitle: mapValueOfType<String>(json, r'promotion_title')!,
        promotionType: PromotionType.fromJson(json[r'promotion_type'])!,
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        templateValues: PromotionTemplateValue.listFromJson(json[r'template_values']),
      );
    }
    return null;
  }

  static List<Promotion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Promotion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Promotion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Promotion> mapFromJson(dynamic json) {
    final map = <String, Promotion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Promotion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Promotion-objects as value to a dart map
  static Map<String, List<Promotion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Promotion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Promotion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_account_id',
    'id',
    'promotion_title',
    'promotion_type',
  };
}

