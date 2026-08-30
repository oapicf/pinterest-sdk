//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AmazonConnectRequest {
  /// Returns a new [AmazonConnectRequest] instance.
  AmazonConnectRequest({
    this.amazonStorefrontId,
    required this.amazonStorefrontName,
    required this.amazonStorefrontUrl,
    this.amazonUserId,
    required this.isAmazonAccountLinked,
    this.oneTimePasscode,
    this.pinterestUserId,
  });

  /// The Amazon storefront id
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? amazonStorefrontId;

  /// The Amazon storefront name
  String amazonStorefrontName;

  /// The Amazon storefront url
  String amazonStorefrontUrl;

  /// The Amazon user id
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? amazonUserId;

  /// The Amazon account linking status
  bool isAmazonAccountLinked;

  /// The one time passcode for Pinterest-initiated linking requests
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? oneTimePasscode;

  /// The Pinterest user id for Amazon-initiated linking requests
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pinterestUserId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AmazonConnectRequest &&
    other.amazonStorefrontId == amazonStorefrontId &&
    other.amazonStorefrontName == amazonStorefrontName &&
    other.amazonStorefrontUrl == amazonStorefrontUrl &&
    other.amazonUserId == amazonUserId &&
    other.isAmazonAccountLinked == isAmazonAccountLinked &&
    other.oneTimePasscode == oneTimePasscode &&
    other.pinterestUserId == pinterestUserId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (amazonStorefrontId == null ? 0 : amazonStorefrontId!.hashCode) +
    (amazonStorefrontName.hashCode) +
    (amazonStorefrontUrl.hashCode) +
    (amazonUserId == null ? 0 : amazonUserId!.hashCode) +
    (isAmazonAccountLinked.hashCode) +
    (oneTimePasscode == null ? 0 : oneTimePasscode!.hashCode) +
    (pinterestUserId == null ? 0 : pinterestUserId!.hashCode);

  @override
  String toString() => 'AmazonConnectRequest[amazonStorefrontId=$amazonStorefrontId, amazonStorefrontName=$amazonStorefrontName, amazonStorefrontUrl=$amazonStorefrontUrl, amazonUserId=$amazonUserId, isAmazonAccountLinked=$isAmazonAccountLinked, oneTimePasscode=$oneTimePasscode, pinterestUserId=$pinterestUserId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.amazonStorefrontId != null) {
      json[r'amazon_storefront_id'] = this.amazonStorefrontId;
    } else {
      json[r'amazon_storefront_id'] = null;
    }
      json[r'amazon_storefront_name'] = this.amazonStorefrontName;
      json[r'amazon_storefront_url'] = this.amazonStorefrontUrl;
    if (this.amazonUserId != null) {
      json[r'amazon_user_id'] = this.amazonUserId;
    } else {
      json[r'amazon_user_id'] = null;
    }
      json[r'is_amazon_account_linked'] = this.isAmazonAccountLinked;
    if (this.oneTimePasscode != null) {
      json[r'one_time_passcode'] = this.oneTimePasscode;
    } else {
      json[r'one_time_passcode'] = null;
    }
    if (this.pinterestUserId != null) {
      json[r'pinterest_user_id'] = this.pinterestUserId;
    } else {
      json[r'pinterest_user_id'] = null;
    }
    return json;
  }

  /// Returns a new [AmazonConnectRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AmazonConnectRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'amazon_storefront_name'), 'Required key "AmazonConnectRequest[amazon_storefront_name]" is missing from JSON.');
        assert(json[r'amazon_storefront_name'] != null, 'Required key "AmazonConnectRequest[amazon_storefront_name]" has a null value in JSON.');
        assert(json.containsKey(r'amazon_storefront_url'), 'Required key "AmazonConnectRequest[amazon_storefront_url]" is missing from JSON.');
        assert(json[r'amazon_storefront_url'] != null, 'Required key "AmazonConnectRequest[amazon_storefront_url]" has a null value in JSON.');
        assert(json.containsKey(r'is_amazon_account_linked'), 'Required key "AmazonConnectRequest[is_amazon_account_linked]" is missing from JSON.');
        assert(json[r'is_amazon_account_linked'] != null, 'Required key "AmazonConnectRequest[is_amazon_account_linked]" has a null value in JSON.');
        return true;
      }());

      return AmazonConnectRequest(
        amazonStorefrontId: mapValueOfType<String>(json, r'amazon_storefront_id'),
        amazonStorefrontName: mapValueOfType<String>(json, r'amazon_storefront_name')!,
        amazonStorefrontUrl: mapValueOfType<String>(json, r'amazon_storefront_url')!,
        amazonUserId: mapValueOfType<String>(json, r'amazon_user_id'),
        isAmazonAccountLinked: mapValueOfType<bool>(json, r'is_amazon_account_linked')!,
        oneTimePasscode: mapValueOfType<String>(json, r'one_time_passcode'),
        pinterestUserId: mapValueOfType<String>(json, r'pinterest_user_id'),
      );
    }
    return null;
  }

  static List<AmazonConnectRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AmazonConnectRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AmazonConnectRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AmazonConnectRequest> mapFromJson(dynamic json) {
    final map = <String, AmazonConnectRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AmazonConnectRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AmazonConnectRequest-objects as value to a dart map
  static Map<String, List<AmazonConnectRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AmazonConnectRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AmazonConnectRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'amazon_storefront_name',
    'amazon_storefront_url',
    'is_amazon_account_linked',
  };
}

