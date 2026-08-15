//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingKeywordDemographicsAgeDistribution {
  /// Returns a new [TrendingKeywordDemographicsAgeDistribution] instance.
  TrendingKeywordDemographicsAgeDistribution({
    this.ageDistribution,
  });

  TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum? ageDistribution;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingKeywordDemographicsAgeDistribution &&
    other.ageDistribution == ageDistribution;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ageDistribution == null ? 0 : ageDistribution!.hashCode);

  @override
  String toString() => 'TrendingKeywordDemographicsAgeDistribution[ageDistribution=$ageDistribution]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ageDistribution != null) {
      json[r'age_distribution'] = this.ageDistribution;
    } else {
      json[r'age_distribution'] = null;
    }
    return json;
  }

  /// Returns a new [TrendingKeywordDemographicsAgeDistribution] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingKeywordDemographicsAgeDistribution? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingKeywordDemographicsAgeDistribution[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingKeywordDemographicsAgeDistribution[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TrendingKeywordDemographicsAgeDistribution(
        ageDistribution: TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.fromJson(json[r'age_distribution']),
      );
    }
    return null;
  }

  static List<TrendingKeywordDemographicsAgeDistribution> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingKeywordDemographicsAgeDistribution>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingKeywordDemographicsAgeDistribution.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingKeywordDemographicsAgeDistribution> mapFromJson(dynamic json) {
    final map = <String, TrendingKeywordDemographicsAgeDistribution>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingKeywordDemographicsAgeDistribution.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingKeywordDemographicsAgeDistribution-objects as value to a dart map
  static Map<String, List<TrendingKeywordDemographicsAgeDistribution>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingKeywordDemographicsAgeDistribution>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingKeywordDemographicsAgeDistribution.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum {
  /// Instantiate a new enum with the provided [value].
  const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const n1824 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'18-24');
  static const n2534 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'25-34');
  static const n3544 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'35-44');
  static const n4549 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'45-49');
  static const n5054 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'50-54');
  static const n5564 = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'55-64');
  static const n65plus = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum._(r'65+');

  /// List of all possible values in this [enum][TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum].
  static const values = <TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum>[
    n1824,
    n2534,
    n3544,
    n4549,
    n5054,
    n5564,
    n65plus,
  ];

  static TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum? fromJson(dynamic value) => TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer().decode(value);

  static List<TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum] to String,
/// and [decode] dynamic data back to [TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum].
class TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer {
  factory TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer() => _instance ??= const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer._();

  const TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer._();

  String encode(TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'18-24': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n1824;
        case r'25-34': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n2534;
        case r'35-44': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n3544;
        case r'45-49': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n4549;
        case r'50-54': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n5054;
        case r'55-64': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n5564;
        case r'65+': return TrendingKeywordDemographicsAgeDistributionAgeDistributionEnum.n65plus;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer] instance.
  static TrendingKeywordDemographicsAgeDistributionAgeDistributionEnumTypeTransformer? _instance;
}


