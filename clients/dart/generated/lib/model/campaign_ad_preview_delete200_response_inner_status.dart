//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignAdPreviewDelete200ResponseInnerStatus {
  /// Returns a new [CampaignAdPreviewDelete200ResponseInnerStatus] instance.
  CampaignAdPreviewDelete200ResponseInnerStatus({
    required this.statusCode,
    required this.code,
    required this.message,
  });

  CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum statusCode;

  int code;

  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignAdPreviewDelete200ResponseInnerStatus &&
    other.statusCode == statusCode &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (statusCode.hashCode) +
    (code.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'CampaignAdPreviewDelete200ResponseInnerStatus[statusCode=$statusCode, code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'statusCode'] = this.statusCode;
      json[r'code'] = this.code;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [CampaignAdPreviewDelete200ResponseInnerStatus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignAdPreviewDelete200ResponseInnerStatus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'statusCode'), 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[statusCode]" is missing from JSON.');
        assert(json[r'statusCode'] != null, 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[statusCode]" has a null value in JSON.');
        assert(json.containsKey(r'code'), 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[code]" is missing from JSON.');
        assert(json[r'code'] != null, 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[code]" has a null value in JSON.');
        assert(json.containsKey(r'message'), 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "CampaignAdPreviewDelete200ResponseInnerStatus[message]" has a null value in JSON.');
        return true;
      }());

      return CampaignAdPreviewDelete200ResponseInnerStatus(
        statusCode: CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum.parse('${json[r'statusCode']}'),
        code: mapValueOfType<int>(json, r'code')!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<CampaignAdPreviewDelete200ResponseInnerStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignAdPreviewDelete200ResponseInnerStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignAdPreviewDelete200ResponseInnerStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignAdPreviewDelete200ResponseInnerStatus> mapFromJson(dynamic json) {
    final map = <String, CampaignAdPreviewDelete200ResponseInnerStatus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignAdPreviewDelete200ResponseInnerStatus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignAdPreviewDelete200ResponseInnerStatus-objects as value to a dart map
  static Map<String, List<CampaignAdPreviewDelete200ResponseInnerStatus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignAdPreviewDelete200ResponseInnerStatus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignAdPreviewDelete200ResponseInnerStatus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'statusCode',
    'code',
    'message',
  };
}


enum CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum {
  n204._('204'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum._(this._value);

  /// The underlying value of this enum member.
  final num _value;

  @override
  String toString() => _value.toString();

  /// Encodes this enum as a value suitable for JSON.
  num toJson() => _value;

  /// Returns the instance of [CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum? fromJson(dynamic value) => CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum] to num,
/// and [decode] dynamic data back to [CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum].
class CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer {
  factory CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer() => _instance ??= const CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer._();

  const CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer._();

  num encode(CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum data) => data._value;

  /// Returns the instance of [CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case '204': return CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum.n204;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumTypeTransformer? _instance;
}


