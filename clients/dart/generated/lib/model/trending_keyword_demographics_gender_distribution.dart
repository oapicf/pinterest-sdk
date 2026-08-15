//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingKeywordDemographicsGenderDistribution {
  /// Returns a new [TrendingKeywordDemographicsGenderDistribution] instance.
  TrendingKeywordDemographicsGenderDistribution({
    this.genderDistribution,
  });

  TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum? genderDistribution;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingKeywordDemographicsGenderDistribution &&
    other.genderDistribution == genderDistribution;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (genderDistribution == null ? 0 : genderDistribution!.hashCode);

  @override
  String toString() => 'TrendingKeywordDemographicsGenderDistribution[genderDistribution=$genderDistribution]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.genderDistribution != null) {
      json[r'gender_distribution'] = this.genderDistribution;
    } else {
      json[r'gender_distribution'] = null;
    }
    return json;
  }

  /// Returns a new [TrendingKeywordDemographicsGenderDistribution] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingKeywordDemographicsGenderDistribution? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingKeywordDemographicsGenderDistribution[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingKeywordDemographicsGenderDistribution[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TrendingKeywordDemographicsGenderDistribution(
        genderDistribution: TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.fromJson(json[r'gender_distribution']),
      );
    }
    return null;
  }

  static List<TrendingKeywordDemographicsGenderDistribution> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingKeywordDemographicsGenderDistribution>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingKeywordDemographicsGenderDistribution.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingKeywordDemographicsGenderDistribution> mapFromJson(dynamic json) {
    final map = <String, TrendingKeywordDemographicsGenderDistribution>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingKeywordDemographicsGenderDistribution.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingKeywordDemographicsGenderDistribution-objects as value to a dart map
  static Map<String, List<TrendingKeywordDemographicsGenderDistribution>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingKeywordDemographicsGenderDistribution>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingKeywordDemographicsGenderDistribution.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum {
  /// Instantiate a new enum with the provided [value].
  const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const male = TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum._(r'male');
  static const female = TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum._(r'female');
  static const unspecified = TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum._(r'unspecified');

  /// List of all possible values in this [enum][TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum].
  static const values = <TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum>[
    male,
    female,
    unspecified,
  ];

  static TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum? fromJson(dynamic value) => TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer().decode(value);

  static List<TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum] to String,
/// and [decode] dynamic data back to [TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum].
class TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer {
  factory TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer() => _instance ??= const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer._();

  const TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer._();

  String encode(TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'male': return TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.male;
        case r'female': return TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.female;
        case r'unspecified': return TrendingKeywordDemographicsGenderDistributionGenderDistributionEnum.unspecified;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer] instance.
  static TrendingKeywordDemographicsGenderDistributionGenderDistributionEnumTypeTransformer? _instance;
}


