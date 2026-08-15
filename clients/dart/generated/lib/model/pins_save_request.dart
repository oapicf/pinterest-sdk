//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinsSaveRequest {
  /// Returns a new [PinsSaveRequest] instance.
  PinsSaveRequest({
    this.boardId,
    this.boardSectionId,
  });

  /// Unique identifier of the board to which the pin will be saved.
  String? boardId;

  /// Unique identifier of the board section to which the pin will be saved.
  String? boardSectionId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinsSaveRequest &&
    other.boardId == boardId &&
    other.boardSectionId == boardSectionId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (boardId == null ? 0 : boardId!.hashCode) +
    (boardSectionId == null ? 0 : boardSectionId!.hashCode);

  @override
  String toString() => 'PinsSaveRequest[boardId=$boardId, boardSectionId=$boardSectionId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.boardId != null) {
      json[r'board_id'] = this.boardId;
    } else {
      json[r'board_id'] = null;
    }
    if (this.boardSectionId != null) {
      json[r'board_section_id'] = this.boardSectionId;
    } else {
      json[r'board_section_id'] = null;
    }
    return json;
  }

  /// Returns a new [PinsSaveRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinsSaveRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinsSaveRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinsSaveRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinsSaveRequest(
        boardId: mapValueOfType<String>(json, r'board_id'),
        boardSectionId: mapValueOfType<String>(json, r'board_section_id'),
      );
    }
    return null;
  }

  static List<PinsSaveRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinsSaveRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinsSaveRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinsSaveRequest> mapFromJson(dynamic json) {
    final map = <String, PinsSaveRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinsSaveRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinsSaveRequest-objects as value to a dart map
  static Map<String, List<PinsSaveRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinsSaveRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinsSaveRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

