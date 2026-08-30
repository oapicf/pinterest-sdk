//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourceImageBase64 {
  /// Returns a new [PinMediaSourceImageBase64] instance.
  PinMediaSourceImageBase64({
    required this.contentType,
    required this.data,
    this.isStandard = true,
    required this.sourceType,
  });

  ContentType contentType;

  String data;

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  bool isStandard;

  /// The source type of the media.
  PinMediaSourceImageBase64SourceTypeEnum sourceType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourceImageBase64 &&
    other.contentType == contentType &&
    other.data == data &&
    other.isStandard == isStandard &&
    other.sourceType == sourceType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType.hashCode) +
    (data.hashCode) +
    (isStandard.hashCode) +
    (sourceType.hashCode);

  @override
  String toString() => 'PinMediaSourceImageBase64[contentType=$contentType, data=$data, isStandard=$isStandard, sourceType=$sourceType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content_type'] = this.contentType;
      json[r'data'] = this.data;
      json[r'is_standard'] = this.isStandard;
      json[r'source_type'] = this.sourceType;
    return json;
  }

  /// Returns a new [PinMediaSourceImageBase64] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourceImageBase64? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'content_type'), 'Required key "PinMediaSourceImageBase64[content_type]" is missing from JSON.');
        assert(json[r'content_type'] != null, 'Required key "PinMediaSourceImageBase64[content_type]" has a null value in JSON.');
        assert(json.containsKey(r'data'), 'Required key "PinMediaSourceImageBase64[data]" is missing from JSON.');
        assert(json[r'data'] != null, 'Required key "PinMediaSourceImageBase64[data]" has a null value in JSON.');
        assert(json.containsKey(r'source_type'), 'Required key "PinMediaSourceImageBase64[source_type]" is missing from JSON.');
        assert(json[r'source_type'] != null, 'Required key "PinMediaSourceImageBase64[source_type]" has a null value in JSON.');
        return true;
      }());

      return PinMediaSourceImageBase64(
        contentType: ContentType.fromJson(json[r'content_type'])!,
        data: mapValueOfType<String>(json, r'data')!,
        isStandard: mapValueOfType<bool>(json, r'is_standard') ?? true,
        sourceType: PinMediaSourceImageBase64SourceTypeEnum.fromJson(json[r'source_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaSourceImageBase64> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImageBase64>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImageBase64.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourceImageBase64> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourceImageBase64>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourceImageBase64.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourceImageBase64-objects as value to a dart map
  static Map<String, List<PinMediaSourceImageBase64>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourceImageBase64>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourceImageBase64.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'content_type',
    'data',
    'source_type',
  };
}

/// The source type of the media.
enum PinMediaSourceImageBase64SourceTypeEnum {
  imageBase64._(r'image_base64'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinMediaSourceImageBase64SourceTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinMediaSourceImageBase64SourceTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinMediaSourceImageBase64SourceTypeEnum? fromJson(dynamic value) => PinMediaSourceImageBase64SourceTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinMediaSourceImageBase64SourceTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinMediaSourceImageBase64SourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImageBase64SourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImageBase64SourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourceImageBase64SourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourceImageBase64SourceTypeEnum].
class PinMediaSourceImageBase64SourceTypeEnumTypeTransformer {
  factory PinMediaSourceImageBase64SourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourceImageBase64SourceTypeEnumTypeTransformer._();

  const PinMediaSourceImageBase64SourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourceImageBase64SourceTypeEnum data) => data._value;

  /// Returns the instance of [PinMediaSourceImageBase64SourceTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourceImageBase64SourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinMediaSourceImageBase64SourceTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'image_base64': return PinMediaSourceImageBase64SourceTypeEnum.imageBase64;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinMediaSourceImageBase64SourceTypeEnumTypeTransformer? _instance;
}


