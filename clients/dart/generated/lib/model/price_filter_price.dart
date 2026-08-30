//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PriceFilterPrice {
  /// Returns a new [PriceFilterPrice] instance.
  PriceFilterPrice({
    required this.currency,
    this.negated,
    required this.operator_,
    required this.value,
  });

  NonNullableCatalogsCurrency currency;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? negated;

  NumericFilterOperatorType operator_;

  /// Minimum value: 0
  num value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PriceFilterPrice &&
    other.currency == currency &&
    other.negated == negated &&
    other.operator_ == operator_ &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (currency.hashCode) +
    (negated == null ? 0 : negated!.hashCode) +
    (operator_.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'PriceFilterPrice[currency=$currency, negated=$negated, operator_=$operator_, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'currency'] = this.currency;
    if (this.negated != null) {
      json[r'negated'] = this.negated;
    } else {
      json[r'negated'] = null;
    }
      json[r'operator'] = this.operator_;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [PriceFilterPrice] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PriceFilterPrice? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'currency'), 'Required key "PriceFilterPrice[currency]" is missing from JSON.');
        assert(json[r'currency'] != null, 'Required key "PriceFilterPrice[currency]" has a null value in JSON.');
        assert(json.containsKey(r'operator'), 'Required key "PriceFilterPrice[operator]" is missing from JSON.');
        assert(json[r'operator'] != null, 'Required key "PriceFilterPrice[operator]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "PriceFilterPrice[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "PriceFilterPrice[value]" has a null value in JSON.');
        return true;
      }());

      return PriceFilterPrice(
        currency: NonNullableCatalogsCurrency.fromJson(json[r'currency'])!,
        negated: mapValueOfType<bool>(json, r'negated'),
        operator_: NumericFilterOperatorType.fromJson(json[r'operator'])!,
        value: num.parse('${json[r'value']}'),
      );
    }
    return null;
  }

  static List<PriceFilterPrice> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceFilterPrice>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceFilterPrice.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PriceFilterPrice> mapFromJson(dynamic json) {
    final map = <String, PriceFilterPrice>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PriceFilterPrice.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PriceFilterPrice-objects as value to a dart map
  static Map<String, List<PriceFilterPrice>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PriceFilterPrice>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PriceFilterPrice.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'currency',
    'operator',
    'value',
  };
}

