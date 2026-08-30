//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssetAccessRequestResponse {
  /// Returns a new [CreateAssetAccessRequestResponse] instance.
  CreateAssetAccessRequestResponse({
    this.exceptions = const [],
    this.invites = const {},
  });

  /// A list of errors associated with the asset access requests. Will be returned if there is an error.
  List<AssetAccessRequestError> exceptions;

  /// An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
  Map<String, String> invites;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssetAccessRequestResponse &&
    _deepEquality.equals(other.exceptions, exceptions) &&
    _deepEquality.equals(other.invites, invites);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exceptions.hashCode) +
    (invites.hashCode);

  @override
  String toString() => 'CreateAssetAccessRequestResponse[exceptions=$exceptions, invites=$invites]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'exceptions'] = this.exceptions;
      json[r'invites'] = this.invites;
    return json;
  }

  /// Returns a new [CreateAssetAccessRequestResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssetAccessRequestResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CreateAssetAccessRequestResponse(
        exceptions: AssetAccessRequestError.listFromJson(json[r'exceptions']),
        invites: mapCastOfType<String, String>(json, r'invites') ?? const {},
      );
    }
    return null;
  }

  static List<CreateAssetAccessRequestResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssetAccessRequestResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssetAccessRequestResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssetAccessRequestResponse> mapFromJson(dynamic json) {
    final map = <String, CreateAssetAccessRequestResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssetAccessRequestResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssetAccessRequestResponse-objects as value to a dart map
  static Map<String, List<CreateAssetAccessRequestResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssetAccessRequestResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssetAccessRequestResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

