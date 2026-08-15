//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinterestLibStatus204 {
  /// Returns a new [PinterestLibStatus204] instance.
  PinterestLibStatus204({
    required this.statusCode,
  });

  PinterestLibStatus204StatusCodeEnum statusCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinterestLibStatus204 &&
    other.statusCode == statusCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (statusCode.hashCode);

  @override
  String toString() => 'PinterestLibStatus204[statusCode=$statusCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'statusCode'] = this.statusCode;
    return json;
  }

  /// Returns a new [PinterestLibStatus204] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinterestLibStatus204? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinterestLibStatus204[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinterestLibStatus204[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinterestLibStatus204(
        statusCode: PinterestLibStatus204StatusCodeEnum.parse('${json[r'statusCode']}'),
      );
    }
    return null;
  }

  static List<PinterestLibStatus204> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinterestLibStatus204>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinterestLibStatus204.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinterestLibStatus204> mapFromJson(dynamic json) {
    final map = <String, PinterestLibStatus204>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinterestLibStatus204.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinterestLibStatus204-objects as value to a dart map
  static Map<String, List<PinterestLibStatus204>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinterestLibStatus204>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinterestLibStatus204.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'statusCode',
  };
}


class PinterestLibStatus204StatusCodeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinterestLibStatus204StatusCodeEnum._(this.value);

  /// The underlying value of this enum member.
  final num value;

  @override
  String toString() => value.toString();

  num toJson() => value;

  static const n204 = PinterestLibStatus204StatusCodeEnum._('204');

  /// List of all possible values in this [enum][PinterestLibStatus204StatusCodeEnum].
  static const values = <PinterestLibStatus204StatusCodeEnum>[
    n204,
  ];

  static PinterestLibStatus204StatusCodeEnum? fromJson(dynamic value) => PinterestLibStatus204StatusCodeEnumTypeTransformer().decode(value);

  static List<PinterestLibStatus204StatusCodeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinterestLibStatus204StatusCodeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinterestLibStatus204StatusCodeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinterestLibStatus204StatusCodeEnum] to num,
/// and [decode] dynamic data back to [PinterestLibStatus204StatusCodeEnum].
class PinterestLibStatus204StatusCodeEnumTypeTransformer {
  factory PinterestLibStatus204StatusCodeEnumTypeTransformer() => _instance ??= const PinterestLibStatus204StatusCodeEnumTypeTransformer._();

  const PinterestLibStatus204StatusCodeEnumTypeTransformer._();

  num encode(PinterestLibStatus204StatusCodeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinterestLibStatus204StatusCodeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinterestLibStatus204StatusCodeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case '204': return PinterestLibStatus204StatusCodeEnum.n204;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinterestLibStatus204StatusCodeEnumTypeTransformer] instance.
  static PinterestLibStatus204StatusCodeEnumTypeTransformer? _instance;
}


