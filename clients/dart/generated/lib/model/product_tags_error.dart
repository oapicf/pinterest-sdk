//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductTagsError {
  /// Returns a new [ProductTagsError] instance.
  ProductTagsError({
    required this.code,
    this.details,
    required this.message,
  });

  int code;

  /// Details about which product tags failed eligibility check.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  IneligibleProductTagsErrorDetails? details;

  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductTagsError &&
    other.code == code &&
    other.details == details &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (details == null ? 0 : details!.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'ProductTagsError[code=$code, details=$details, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
    if (this.details != null) {
      json[r'details'] = this.details;
    } else {
      json[r'details'] = null;
    }
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [ProductTagsError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductTagsError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'code'), 'Required key "ProductTagsError[code]" is missing from JSON.');
        assert(json[r'code'] != null, 'Required key "ProductTagsError[code]" has a null value in JSON.');
        assert(json.containsKey(r'message'), 'Required key "ProductTagsError[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "ProductTagsError[message]" has a null value in JSON.');
        return true;
      }());

      return ProductTagsError(
        code: mapValueOfType<int>(json, r'code')!,
        details: IneligibleProductTagsErrorDetails.fromJson(json[r'details']),
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<ProductTagsError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductTagsError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductTagsError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductTagsError> mapFromJson(dynamic json) {
    final map = <String, ProductTagsError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductTagsError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductTagsError-objects as value to a dart map
  static Map<String, List<ProductTagsError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductTagsError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductTagsError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'message',
  };
}

