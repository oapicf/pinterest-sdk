//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PlacementMultipliers {
  /// Returns a new [PlacementMultipliers] instance.
  PlacementMultipliers({
    this.PLACEMENT,
  });

  PlacementMultipliersPLACEMENTEnum? PLACEMENT;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PlacementMultipliers &&
    other.PLACEMENT == PLACEMENT;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (PLACEMENT == null ? 0 : PLACEMENT!.hashCode);

  @override
  String toString() => 'PlacementMultipliers[PLACEMENT=$PLACEMENT]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.PLACEMENT != null) {
      json[r'PLACEMENT'] = this.PLACEMENT;
    } else {
      json[r'PLACEMENT'] = null;
    }
    return json;
  }

  /// Returns a new [PlacementMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PlacementMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PlacementMultipliers[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PlacementMultipliers[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PlacementMultipliers(
        PLACEMENT: PlacementMultipliersPLACEMENTEnum.fromJson(json[r'PLACEMENT']),
      );
    }
    return null;
  }

  static List<PlacementMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PlacementMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PlacementMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PlacementMultipliers> mapFromJson(dynamic json) {
    final map = <String, PlacementMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PlacementMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PlacementMultipliers-objects as value to a dart map
  static Map<String, List<PlacementMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PlacementMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PlacementMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class PlacementMultipliersPLACEMENTEnum {
  /// Instantiate a new enum with the provided [value].
  const PlacementMultipliersPLACEMENTEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SEARCH = PlacementMultipliersPLACEMENTEnum._(r'SEARCH');
  static const BROWSE = PlacementMultipliersPLACEMENTEnum._(r'BROWSE');
  static const RELATED_PINS = PlacementMultipliersPLACEMENTEnum._(r'RELATED_PINS');

  /// List of all possible values in this [enum][PlacementMultipliersPLACEMENTEnum].
  static const values = <PlacementMultipliersPLACEMENTEnum>[
    SEARCH,
    BROWSE,
    RELATED_PINS,
  ];

  static PlacementMultipliersPLACEMENTEnum? fromJson(dynamic value) => PlacementMultipliersPLACEMENTEnumTypeTransformer().decode(value);

  static List<PlacementMultipliersPLACEMENTEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PlacementMultipliersPLACEMENTEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PlacementMultipliersPLACEMENTEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PlacementMultipliersPLACEMENTEnum] to String,
/// and [decode] dynamic data back to [PlacementMultipliersPLACEMENTEnum].
class PlacementMultipliersPLACEMENTEnumTypeTransformer {
  factory PlacementMultipliersPLACEMENTEnumTypeTransformer() => _instance ??= const PlacementMultipliersPLACEMENTEnumTypeTransformer._();

  const PlacementMultipliersPLACEMENTEnumTypeTransformer._();

  String encode(PlacementMultipliersPLACEMENTEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PlacementMultipliersPLACEMENTEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PlacementMultipliersPLACEMENTEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SEARCH': return PlacementMultipliersPLACEMENTEnum.SEARCH;
        case r'BROWSE': return PlacementMultipliersPLACEMENTEnum.BROWSE;
        case r'RELATED_PINS': return PlacementMultipliersPLACEMENTEnum.RELATED_PINS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PlacementMultipliersPLACEMENTEnumTypeTransformer] instance.
  static PlacementMultipliersPLACEMENTEnumTypeTransformer? _instance;
}


