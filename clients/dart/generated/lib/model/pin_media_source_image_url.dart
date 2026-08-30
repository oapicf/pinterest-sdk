//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourceImageURL {
  /// Returns a new [PinMediaSourceImageURL] instance.
  PinMediaSourceImageURL({
    this.isStandard = true,
    required this.sourceType,
    required this.url,
  });

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  bool isStandard;

  /// The source type of the media.
  PinMediaSourceImageURLSourceTypeEnum sourceType;

  String url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourceImageURL &&
    other.isStandard == isStandard &&
    other.sourceType == sourceType &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isStandard.hashCode) +
    (sourceType.hashCode) +
    (url.hashCode);

  @override
  String toString() => 'PinMediaSourceImageURL[isStandard=$isStandard, sourceType=$sourceType, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_standard'] = this.isStandard;
      json[r'source_type'] = this.sourceType;
      json[r'url'] = this.url;
    return json;
  }

  /// Returns a new [PinMediaSourceImageURL] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourceImageURL? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'source_type'), 'Required key "PinMediaSourceImageURL[source_type]" is missing from JSON.');
        assert(json[r'source_type'] != null, 'Required key "PinMediaSourceImageURL[source_type]" has a null value in JSON.');
        assert(json.containsKey(r'url'), 'Required key "PinMediaSourceImageURL[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "PinMediaSourceImageURL[url]" has a null value in JSON.');
        return true;
      }());

      return PinMediaSourceImageURL(
        isStandard: mapValueOfType<bool>(json, r'is_standard') ?? true,
        sourceType: PinMediaSourceImageURLSourceTypeEnum.fromJson(json[r'source_type'])!,
        url: mapValueOfType<String>(json, r'url')!,
      );
    }
    return null;
  }

  static List<PinMediaSourceImageURL> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImageURL>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImageURL.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourceImageURL> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourceImageURL>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourceImageURL.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourceImageURL-objects as value to a dart map
  static Map<String, List<PinMediaSourceImageURL>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourceImageURL>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourceImageURL.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'source_type',
    'url',
  };
}

/// The source type of the media.
enum PinMediaSourceImageURLSourceTypeEnum {
  imageUrl._(r'image_url'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinMediaSourceImageURLSourceTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinMediaSourceImageURLSourceTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinMediaSourceImageURLSourceTypeEnum? fromJson(dynamic value) => PinMediaSourceImageURLSourceTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinMediaSourceImageURLSourceTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinMediaSourceImageURLSourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImageURLSourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImageURLSourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourceImageURLSourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourceImageURLSourceTypeEnum].
class PinMediaSourceImageURLSourceTypeEnumTypeTransformer {
  factory PinMediaSourceImageURLSourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourceImageURLSourceTypeEnumTypeTransformer._();

  const PinMediaSourceImageURLSourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourceImageURLSourceTypeEnum data) => data._value;

  /// Returns the instance of [PinMediaSourceImageURLSourceTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourceImageURLSourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinMediaSourceImageURLSourceTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'image_url': return PinMediaSourceImageURLSourceTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinMediaSourceImageURLSourceTypeEnumTypeTransformer? _instance;
}


