//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationLogClientRequest {
  /// Returns a new [IntegrationLogClientRequest] instance.
  IntegrationLogClientRequest({
    required this.host,
    required this.method,
    required this.path,
    this.requestHeaders = const {},
    this.responseHeaders = const {},
    this.responseStatusCode,
  });

  /// HTTP request host from host header.
  String host;

  HttpMethod method;

  /// HTTP request path.
  String path;

  /// HTTP request headers as key-value pairs.
  Map<String, String> requestHeaders;

  /// HTTP response headers as key-value pairs.
  Map<String, String> responseHeaders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? responseStatusCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationLogClientRequest &&
    other.host == host &&
    other.method == method &&
    other.path == path &&
    _deepEquality.equals(other.requestHeaders, requestHeaders) &&
    _deepEquality.equals(other.responseHeaders, responseHeaders) &&
    other.responseStatusCode == responseStatusCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (host.hashCode) +
    (method.hashCode) +
    (path.hashCode) +
    (requestHeaders.hashCode) +
    (responseHeaders.hashCode) +
    (responseStatusCode == null ? 0 : responseStatusCode!.hashCode);

  @override
  String toString() => 'IntegrationLogClientRequest[host=$host, method=$method, path=$path, requestHeaders=$requestHeaders, responseHeaders=$responseHeaders, responseStatusCode=$responseStatusCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'host'] = this.host;
      json[r'method'] = this.method;
      json[r'path'] = this.path;
      json[r'request_headers'] = this.requestHeaders;
      json[r'response_headers'] = this.responseHeaders;
    if (this.responseStatusCode != null) {
      json[r'response_status_code'] = this.responseStatusCode;
    } else {
      json[r'response_status_code'] = null;
    }
    return json;
  }

  /// Returns a new [IntegrationLogClientRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationLogClientRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'host'), 'Required key "IntegrationLogClientRequest[host]" is missing from JSON.');
        assert(json[r'host'] != null, 'Required key "IntegrationLogClientRequest[host]" has a null value in JSON.');
        assert(json.containsKey(r'method'), 'Required key "IntegrationLogClientRequest[method]" is missing from JSON.');
        assert(json[r'method'] != null, 'Required key "IntegrationLogClientRequest[method]" has a null value in JSON.');
        assert(json.containsKey(r'path'), 'Required key "IntegrationLogClientRequest[path]" is missing from JSON.');
        assert(json[r'path'] != null, 'Required key "IntegrationLogClientRequest[path]" has a null value in JSON.');
        return true;
      }());

      return IntegrationLogClientRequest(
        host: mapValueOfType<String>(json, r'host')!,
        method: HttpMethod.fromJson(json[r'method'])!,
        path: mapValueOfType<String>(json, r'path')!,
        requestHeaders: mapCastOfType<String, String>(json, r'request_headers') ?? const {},
        responseHeaders: mapCastOfType<String, String>(json, r'response_headers') ?? const {},
        responseStatusCode: mapValueOfType<int>(json, r'response_status_code'),
      );
    }
    return null;
  }

  static List<IntegrationLogClientRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogClientRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogClientRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationLogClientRequest> mapFromJson(dynamic json) {
    final map = <String, IntegrationLogClientRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationLogClientRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationLogClientRequest-objects as value to a dart map
  static Map<String, List<IntegrationLogClientRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationLogClientRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationLogClientRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'host',
    'method',
    'path',
  };
}

