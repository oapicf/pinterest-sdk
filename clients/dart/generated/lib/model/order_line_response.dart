//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderLineResponse {
  /// Returns a new [OrderLineResponse] instance.
  OrderLineResponse({
    this.errors = const [],
    this.orderLine = const [],
  });

  /// Error list if update(s) fail.
  List<OrderLineError> errors;

  /// Order Line object array.
  List<OrderLine> orderLine;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderLineResponse &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.orderLine, orderLine);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (orderLine.hashCode);

  @override
  String toString() => 'OrderLineResponse[errors=$errors, orderLine=$orderLine]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'order_line'] = this.orderLine;
    return json;
  }

  /// Returns a new [OrderLineResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderLineResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderLineResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderLineResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderLineResponse(
        errors: OrderLineError.listFromJson(json[r'errors']),
        orderLine: OrderLine.listFromJson(json[r'order_line']),
      );
    }
    return null;
  }

  static List<OrderLineResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLineResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLineResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderLineResponse> mapFromJson(dynamic json) {
    final map = <String, OrderLineResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderLineResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderLineResponse-objects as value to a dart map
  static Map<String, List<OrderLineResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderLineResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderLineResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

