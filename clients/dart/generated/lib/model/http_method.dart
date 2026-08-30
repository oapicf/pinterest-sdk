//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// HTTP request method.
enum HttpMethod {
  GET._(r'GET'),
  HEAD._(r'HEAD'),
  POST._(r'POST'),
  PUT._(r'PUT'),
  DELETE._(r'DELETE'),
  CONNECT._(r'CONNECT'),
  OPTIONS._(r'OPTIONS'),
  TRACE._(r'TRACE'),
  PATCH._(r'PATCH'),
  ;

  /// Instantiate a new enum with the provided value.
  const HttpMethod._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [HttpMethod] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static HttpMethod? fromJson(dynamic value) => HttpMethodTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [HttpMethod]
  /// that were successfully decoded from the passed [JSON][json].
  static List<HttpMethod> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <HttpMethod>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = HttpMethod.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [HttpMethod] to String,
/// and [decode] dynamic data back to [HttpMethod].
class HttpMethodTypeTransformer {
  factory HttpMethodTypeTransformer() => _instance ??= const HttpMethodTypeTransformer._();

  const HttpMethodTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(HttpMethod data) => data._value;

  /// Returns the instance of [HttpMethod] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  HttpMethod? decode(dynamic data, {bool allowNull = true}) {
    if (data is HttpMethod) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'GET': return HttpMethod.GET;
        case r'HEAD': return HttpMethod.HEAD;
        case r'POST': return HttpMethod.POST;
        case r'PUT': return HttpMethod.PUT;
        case r'DELETE': return HttpMethod.DELETE;
        case r'CONNECT': return HttpMethod.CONNECT;
        case r'OPTIONS': return HttpMethod.OPTIONS;
        case r'TRACE': return HttpMethod.TRACE;
        case r'PATCH': return HttpMethod.PATCH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static HttpMethodTypeTransformer? _instance;
}

