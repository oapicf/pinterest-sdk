//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourceImagesBase64 {
  /// Returns a new [PinMediaSourceImagesBase64] instance.
  PinMediaSourceImagesBase64({
    this.index,
    this.items = const [],
    required this.sourceType,
  });

  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? index;

  /// Array with image objects.
  List<PinMediaSourceImagesBase64Item> items;

  /// The source type of the media.
  PinMediaSourceImagesBase64SourceTypeEnum sourceType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourceImagesBase64 &&
    other.index == index &&
    _deepEquality.equals(other.items, items) &&
    other.sourceType == sourceType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index == null ? 0 : index!.hashCode) +
    (items.hashCode) +
    (sourceType.hashCode);

  @override
  String toString() => 'PinMediaSourceImagesBase64[index=$index, items=$items, sourceType=$sourceType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.index != null) {
      json[r'index'] = this.index;
    } else {
      json[r'index'] = null;
    }
      json[r'items'] = this.items;
      json[r'source_type'] = this.sourceType;
    return json;
  }

  /// Returns a new [PinMediaSourceImagesBase64] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourceImagesBase64? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaSourceImagesBase64[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaSourceImagesBase64[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaSourceImagesBase64(
        index: mapValueOfType<int>(json, r'index'),
        items: PinMediaSourceImagesBase64Item.listFromJson(json[r'items']),
        sourceType: PinMediaSourceImagesBase64SourceTypeEnum.fromJson(json[r'source_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaSourceImagesBase64> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImagesBase64>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImagesBase64.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourceImagesBase64> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourceImagesBase64>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourceImagesBase64.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourceImagesBase64-objects as value to a dart map
  static Map<String, List<PinMediaSourceImagesBase64>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourceImagesBase64>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourceImagesBase64.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
    'source_type',
  };
}

/// The source type of the media.
class PinMediaSourceImagesBase64SourceTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaSourceImagesBase64SourceTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const multipleImageBase64 = PinMediaSourceImagesBase64SourceTypeEnum._(r'multiple_image_base64');

  /// List of all possible values in this [enum][PinMediaSourceImagesBase64SourceTypeEnum].
  static const values = <PinMediaSourceImagesBase64SourceTypeEnum>[
    multipleImageBase64,
  ];

  static PinMediaSourceImagesBase64SourceTypeEnum? fromJson(dynamic value) => PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer().decode(value);

  static List<PinMediaSourceImagesBase64SourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceImagesBase64SourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceImagesBase64SourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourceImagesBase64SourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourceImagesBase64SourceTypeEnum].
class PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer {
  factory PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer._();

  const PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourceImagesBase64SourceTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaSourceImagesBase64SourceTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourceImagesBase64SourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'multiple_image_base64': return PinMediaSourceImagesBase64SourceTypeEnum.multipleImageBase64;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer] instance.
  static PinMediaSourceImagesBase64SourceTypeEnumTypeTransformer? _instance;
}


