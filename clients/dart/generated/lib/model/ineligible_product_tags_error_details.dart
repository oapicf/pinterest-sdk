//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IneligibleProductTagsErrorDetails {
  /// Returns a new [IneligibleProductTagsErrorDetails] instance.
  IneligibleProductTagsErrorDetails({
    this.productTags = const [],
  });

  /// List of product tags that failed eligibility check.
  List<IneligibleProductTagErrorItem> productTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IneligibleProductTagsErrorDetails &&
    _deepEquality.equals(other.productTags, productTags);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (productTags.hashCode);

  @override
  String toString() => 'IneligibleProductTagsErrorDetails[productTags=$productTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'product_tags'] = this.productTags;
    return json;
  }

  /// Returns a new [IneligibleProductTagsErrorDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IneligibleProductTagsErrorDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'product_tags'), 'Required key "IneligibleProductTagsErrorDetails[product_tags]" is missing from JSON.');
        assert(json[r'product_tags'] != null, 'Required key "IneligibleProductTagsErrorDetails[product_tags]" has a null value in JSON.');
        return true;
      }());

      return IneligibleProductTagsErrorDetails(
        productTags: IneligibleProductTagErrorItem.listFromJson(json[r'product_tags']),
      );
    }
    return null;
  }

  static List<IneligibleProductTagsErrorDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IneligibleProductTagsErrorDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IneligibleProductTagsErrorDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IneligibleProductTagsErrorDetails> mapFromJson(dynamic json) {
    final map = <String, IneligibleProductTagsErrorDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IneligibleProductTagsErrorDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IneligibleProductTagsErrorDetails-objects as value to a dart map
  static Map<String, List<IneligibleProductTagsErrorDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IneligibleProductTagsErrorDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IneligibleProductTagsErrorDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'product_tags',
  };
}

