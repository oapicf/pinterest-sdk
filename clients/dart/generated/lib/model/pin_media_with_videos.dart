//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaWithVideos {
  /// Returns a new [PinMediaWithVideos] instance.
  PinMediaWithVideos({
    this.items = const [],
    required this.mediaType,
  });

  List<VideoMetadataWithItemType> items;

  PinMediaWithVideosMediaTypeEnum mediaType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaWithVideos &&
    _deepEquality.equals(other.items, items) &&
    other.mediaType == mediaType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode) +
    (mediaType.hashCode);

  @override
  String toString() => 'PinMediaWithVideos[items=$items, mediaType=$mediaType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
      json[r'media_type'] = this.mediaType;
    return json;
  }

  /// Returns a new [PinMediaWithVideos] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaWithVideos? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaWithVideos[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaWithVideos[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaWithVideos(
        items: VideoMetadataWithItemType.listFromJson(json[r'items']),
        mediaType: PinMediaWithVideosMediaTypeEnum.fromJson(json[r'media_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaWithVideos> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithVideos>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithVideos.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaWithVideos> mapFromJson(dynamic json) {
    final map = <String, PinMediaWithVideos>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaWithVideos.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaWithVideos-objects as value to a dart map
  static Map<String, List<PinMediaWithVideos>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaWithVideos>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaWithVideos.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_type',
  };
}


class PinMediaWithVideosMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaWithVideosMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const multipleVideos = PinMediaWithVideosMediaTypeEnum._(r'multiple_videos');

  /// List of all possible values in this [enum][PinMediaWithVideosMediaTypeEnum].
  static const values = <PinMediaWithVideosMediaTypeEnum>[
    multipleVideos,
  ];

  static PinMediaWithVideosMediaTypeEnum? fromJson(dynamic value) => PinMediaWithVideosMediaTypeEnumTypeTransformer().decode(value);

  static List<PinMediaWithVideosMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithVideosMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithVideosMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaWithVideosMediaTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaWithVideosMediaTypeEnum].
class PinMediaWithVideosMediaTypeEnumTypeTransformer {
  factory PinMediaWithVideosMediaTypeEnumTypeTransformer() => _instance ??= const PinMediaWithVideosMediaTypeEnumTypeTransformer._();

  const PinMediaWithVideosMediaTypeEnumTypeTransformer._();

  String encode(PinMediaWithVideosMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaWithVideosMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaWithVideosMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'multiple_videos': return PinMediaWithVideosMediaTypeEnum.multipleVideos;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaWithVideosMediaTypeEnumTypeTransformer] instance.
  static PinMediaWithVideosMediaTypeEnumTypeTransformer? _instance;
}


