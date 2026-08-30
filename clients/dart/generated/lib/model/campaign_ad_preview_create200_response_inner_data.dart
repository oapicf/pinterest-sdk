//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignAdPreviewCreate200ResponseInnerData {
  /// Returns a new [CampaignAdPreviewCreate200ResponseInnerData] instance.
  CampaignAdPreviewCreate200ResponseInnerData({
    required this.adAccountId,
    required this.adGroupId,
    this.clientId,
    required this.expiresAt,
    required this.isActive,
    this.pinId,
    this.pinPromotionId,
    this.promotedProductGroupId,
    required this.url,
    required this.userId,
    required this.uuid,
    required this.exceptions,
  });

  /// Advertiser ID for this preview.
  String adAccountId;

  /// Ad group ID to create a preview record for.
  String adGroupId;

  /// Client ID that created preview.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? clientId;

  /// Unix timestamp in milliseconds for preview expiration.
  int expiresAt;

  /// Whether preview link is active.
  bool isActive;

  /// Pin ID for pin promotion preview.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pinId;

  /// Pin promotion ID for this preview.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pinPromotionId;

  /// Promoted product group ID for catalog previews.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? promotedProductGroupId;

  /// Campaign ad preview URL.
  String url;

  /// User ID that created preview.
  int userId;

  /// Pin promotion preview key.
  String uuid;

  PinterestLibError exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignAdPreviewCreate200ResponseInnerData &&
    other.adAccountId == adAccountId &&
    other.adGroupId == adGroupId &&
    other.clientId == clientId &&
    other.expiresAt == expiresAt &&
    other.isActive == isActive &&
    other.pinId == pinId &&
    other.pinPromotionId == pinPromotionId &&
    other.promotedProductGroupId == promotedProductGroupId &&
    other.url == url &&
    other.userId == userId &&
    other.uuid == uuid &&
    other.exceptions == exceptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId.hashCode) +
    (adGroupId.hashCode) +
    (clientId == null ? 0 : clientId!.hashCode) +
    (expiresAt.hashCode) +
    (isActive.hashCode) +
    (pinId == null ? 0 : pinId!.hashCode) +
    (pinPromotionId == null ? 0 : pinPromotionId!.hashCode) +
    (promotedProductGroupId == null ? 0 : promotedProductGroupId!.hashCode) +
    (url.hashCode) +
    (userId.hashCode) +
    (uuid.hashCode) +
    (exceptions.hashCode);

  @override
  String toString() => 'CampaignAdPreviewCreate200ResponseInnerData[adAccountId=$adAccountId, adGroupId=$adGroupId, clientId=$clientId, expiresAt=$expiresAt, isActive=$isActive, pinId=$pinId, pinPromotionId=$pinPromotionId, promotedProductGroupId=$promotedProductGroupId, url=$url, userId=$userId, uuid=$uuid, exceptions=$exceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_account_id'] = this.adAccountId;
      json[r'ad_group_id'] = this.adGroupId;
    if (this.clientId != null) {
      json[r'client_id'] = this.clientId;
    } else {
      json[r'client_id'] = null;
    }
      json[r'expires_at'] = this.expiresAt;
      json[r'is_active'] = this.isActive;
    if (this.pinId != null) {
      json[r'pin_id'] = this.pinId;
    } else {
      json[r'pin_id'] = null;
    }
    if (this.pinPromotionId != null) {
      json[r'pin_promotion_id'] = this.pinPromotionId;
    } else {
      json[r'pin_promotion_id'] = null;
    }
    if (this.promotedProductGroupId != null) {
      json[r'promoted_product_group_id'] = this.promotedProductGroupId;
    } else {
      json[r'promoted_product_group_id'] = null;
    }
      json[r'url'] = this.url;
      json[r'user_id'] = this.userId;
      json[r'uuid'] = this.uuid;
      json[r'exceptions'] = this.exceptions;
    return json;
  }

  /// Returns a new [CampaignAdPreviewCreate200ResponseInnerData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignAdPreviewCreate200ResponseInnerData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_account_id'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[ad_account_id]" is missing from JSON.');
        assert(json[r'ad_account_id'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[ad_account_id]" has a null value in JSON.');
        assert(json.containsKey(r'ad_group_id'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[ad_group_id]" is missing from JSON.');
        assert(json[r'ad_group_id'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[ad_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'expires_at'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[expires_at]" is missing from JSON.');
        assert(json[r'expires_at'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[expires_at]" has a null value in JSON.');
        assert(json.containsKey(r'is_active'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[is_active]" is missing from JSON.');
        assert(json[r'is_active'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[is_active]" has a null value in JSON.');
        assert(json.containsKey(r'url'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[url]" has a null value in JSON.');
        assert(json.containsKey(r'user_id'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[user_id]" is missing from JSON.');
        assert(json[r'user_id'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[user_id]" has a null value in JSON.');
        assert(json.containsKey(r'uuid'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[uuid]" is missing from JSON.');
        assert(json[r'uuid'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[uuid]" has a null value in JSON.');
        assert(json.containsKey(r'exceptions'), 'Required key "CampaignAdPreviewCreate200ResponseInnerData[exceptions]" is missing from JSON.');
        assert(json[r'exceptions'] != null, 'Required key "CampaignAdPreviewCreate200ResponseInnerData[exceptions]" has a null value in JSON.');
        return true;
      }());

      return CampaignAdPreviewCreate200ResponseInnerData(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id')!,
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        clientId: mapValueOfType<int>(json, r'client_id'),
        expiresAt: mapValueOfType<int>(json, r'expires_at')!,
        isActive: mapValueOfType<bool>(json, r'is_active')!,
        pinId: mapValueOfType<int>(json, r'pin_id'),
        pinPromotionId: mapValueOfType<int>(json, r'pin_promotion_id'),
        promotedProductGroupId: mapValueOfType<int>(json, r'promoted_product_group_id'),
        url: mapValueOfType<String>(json, r'url')!,
        userId: mapValueOfType<int>(json, r'user_id')!,
        uuid: mapValueOfType<String>(json, r'uuid')!,
        exceptions: PinterestLibError.fromJson(json[r'exceptions'])!,
      );
    }
    return null;
  }

  static List<CampaignAdPreviewCreate200ResponseInnerData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignAdPreviewCreate200ResponseInnerData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignAdPreviewCreate200ResponseInnerData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignAdPreviewCreate200ResponseInnerData> mapFromJson(dynamic json) {
    final map = <String, CampaignAdPreviewCreate200ResponseInnerData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignAdPreviewCreate200ResponseInnerData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignAdPreviewCreate200ResponseInnerData-objects as value to a dart map
  static Map<String, List<CampaignAdPreviewCreate200ResponseInnerData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignAdPreviewCreate200ResponseInnerData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignAdPreviewCreate200ResponseInnerData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_account_id',
    'ad_group_id',
    'expires_at',
    'is_active',
    'url',
    'user_id',
    'uuid',
    'exceptions',
  };
}

