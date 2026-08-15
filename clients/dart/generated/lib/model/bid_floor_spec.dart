//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidFloorSpec {
  /// Returns a new [BidFloorSpec] instance.
  BidFloorSpec({
    required this.billableEvent,
    this.countries = const [],
    this.creativeType,
    required this.currency,
    this.objectiveType,
    this.optimizationGoalMetadata,
  });

  ActionType billableEvent;

  List<Country> countries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreativeType? creativeType;

  Currency currency;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ObjectiveType? objectiveType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OptimizationGoalMetadata? optimizationGoalMetadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidFloorSpec &&
    other.billableEvent == billableEvent &&
    _deepEquality.equals(other.countries, countries) &&
    other.creativeType == creativeType &&
    other.currency == currency &&
    other.objectiveType == objectiveType &&
    other.optimizationGoalMetadata == optimizationGoalMetadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (billableEvent.hashCode) +
    (countries.hashCode) +
    (creativeType == null ? 0 : creativeType!.hashCode) +
    (currency.hashCode) +
    (objectiveType == null ? 0 : objectiveType!.hashCode) +
    (optimizationGoalMetadata == null ? 0 : optimizationGoalMetadata!.hashCode);

  @override
  String toString() => 'BidFloorSpec[billableEvent=$billableEvent, countries=$countries, creativeType=$creativeType, currency=$currency, objectiveType=$objectiveType, optimizationGoalMetadata=$optimizationGoalMetadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'billable_event'] = this.billableEvent;
      json[r'countries'] = this.countries;
    if (this.creativeType != null) {
      json[r'creative_type'] = this.creativeType;
    } else {
      json[r'creative_type'] = null;
    }
      json[r'currency'] = this.currency;
    if (this.objectiveType != null) {
      json[r'objective_type'] = this.objectiveType;
    } else {
      json[r'objective_type'] = null;
    }
    if (this.optimizationGoalMetadata != null) {
      json[r'optimization_goal_metadata'] = this.optimizationGoalMetadata;
    } else {
      json[r'optimization_goal_metadata'] = null;
    }
    return json;
  }

  /// Returns a new [BidFloorSpec] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidFloorSpec? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BidFloorSpec[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BidFloorSpec[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BidFloorSpec(
        billableEvent: ActionType.fromJson(json[r'billable_event'])!,
        countries: Country.listFromJson(json[r'countries']),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
        currency: Currency.fromJson(json[r'currency'])!,
        objectiveType: ObjectiveType.fromJson(json[r'objective_type']),
        optimizationGoalMetadata: OptimizationGoalMetadata.fromJson(json[r'optimization_goal_metadata']),
      );
    }
    return null;
  }

  static List<BidFloorSpec> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidFloorSpec>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidFloorSpec.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidFloorSpec> mapFromJson(dynamic json) {
    final map = <String, BidFloorSpec>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidFloorSpec.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidFloorSpec-objects as value to a dart map
  static Map<String, List<BidFloorSpec>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidFloorSpec>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidFloorSpec.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'billable_event',
    'currency',
  };
}

