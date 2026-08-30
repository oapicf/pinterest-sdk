//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionMSOTEventsCreate {
  /// Returns a new [ConversionMSOTEventsCreate] instance.
  ConversionMSOTEventsCreate({
    this.actionTimestamps = const [],
    required this.adGroupId,
    this.attributionModel,
    this.attributionScope,
    this.attributionScore,
    this.campaignId,
    this.clickWindow,
    this.currency,
    required this.eventId,
    required this.eventName,
    required this.eventTimestamp,
    this.totalEventTouchpoints,
    this.totalEvents,
    this.totalEventsFractional,
    this.value,
    this.viewWindow,
  });

  /// Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  List<int> actionTimestamps;

  /// The ID of the ad group that was attributed to the conversion event.
  String adGroupId;

  /// The attribution model used to attribute the conversion event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AttributionModel? attributionModel;

  /// Ad event type.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AttributionScope? attributionScope;

  /// Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  ///
  /// Minimum value: 0
  /// Maximum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? attributionScore;

  /// The ID of the campaign that was attributed to the conversion event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignId;

  /// Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? clickWindow;

  /// Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currency;

  /// A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  String eventId;

  /// Type of user event.
  MsotEventName eventName;

  /// The time when the event occurred. Unix timestamp in seconds.
  int eventTimestamp;

  /// Total number of ad events including other non-Pinterest ad platforms.
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalEventTouchpoints;

  /// Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalEvents;

  /// Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? totalEventsFractional;

  /// Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? value;

  /// View window used for attribution (for example, `1d`, `7d`, `30d`).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? viewWindow;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionMSOTEventsCreate &&
    _deepEquality.equals(other.actionTimestamps, actionTimestamps) &&
    other.adGroupId == adGroupId &&
    other.attributionModel == attributionModel &&
    other.attributionScope == attributionScope &&
    other.attributionScore == attributionScore &&
    other.campaignId == campaignId &&
    other.clickWindow == clickWindow &&
    other.currency == currency &&
    other.eventId == eventId &&
    other.eventName == eventName &&
    other.eventTimestamp == eventTimestamp &&
    other.totalEventTouchpoints == totalEventTouchpoints &&
    other.totalEvents == totalEvents &&
    other.totalEventsFractional == totalEventsFractional &&
    other.value == value &&
    other.viewWindow == viewWindow;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (actionTimestamps.hashCode) +
    (adGroupId.hashCode) +
    (attributionModel == null ? 0 : attributionModel!.hashCode) +
    (attributionScope == null ? 0 : attributionScope!.hashCode) +
    (attributionScore == null ? 0 : attributionScore!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (clickWindow == null ? 0 : clickWindow!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (eventId.hashCode) +
    (eventName.hashCode) +
    (eventTimestamp.hashCode) +
    (totalEventTouchpoints == null ? 0 : totalEventTouchpoints!.hashCode) +
    (totalEvents == null ? 0 : totalEvents!.hashCode) +
    (totalEventsFractional == null ? 0 : totalEventsFractional!.hashCode) +
    (value == null ? 0 : value!.hashCode) +
    (viewWindow == null ? 0 : viewWindow!.hashCode);

  @override
  String toString() => 'ConversionMSOTEventsCreate[actionTimestamps=$actionTimestamps, adGroupId=$adGroupId, attributionModel=$attributionModel, attributionScope=$attributionScope, attributionScore=$attributionScore, campaignId=$campaignId, clickWindow=$clickWindow, currency=$currency, eventId=$eventId, eventName=$eventName, eventTimestamp=$eventTimestamp, totalEventTouchpoints=$totalEventTouchpoints, totalEvents=$totalEvents, totalEventsFractional=$totalEventsFractional, value=$value, viewWindow=$viewWindow]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'action_timestamps'] = this.actionTimestamps;
      json[r'ad_group_id'] = this.adGroupId;
    if (this.attributionModel != null) {
      json[r'attribution_model'] = this.attributionModel;
    } else {
      json[r'attribution_model'] = null;
    }
    if (this.attributionScope != null) {
      json[r'attribution_scope'] = this.attributionScope;
    } else {
      json[r'attribution_scope'] = null;
    }
    if (this.attributionScore != null) {
      json[r'attribution_score'] = this.attributionScore;
    } else {
      json[r'attribution_score'] = null;
    }
    if (this.campaignId != null) {
      json[r'campaign_id'] = this.campaignId;
    } else {
      json[r'campaign_id'] = null;
    }
    if (this.clickWindow != null) {
      json[r'click_window'] = this.clickWindow;
    } else {
      json[r'click_window'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
      json[r'event_id'] = this.eventId;
      json[r'event_name'] = this.eventName;
      json[r'event_timestamp'] = this.eventTimestamp;
    if (this.totalEventTouchpoints != null) {
      json[r'total_event_touchpoints'] = this.totalEventTouchpoints;
    } else {
      json[r'total_event_touchpoints'] = null;
    }
    if (this.totalEvents != null) {
      json[r'total_events'] = this.totalEvents;
    } else {
      json[r'total_events'] = null;
    }
    if (this.totalEventsFractional != null) {
      json[r'total_events_fractional'] = this.totalEventsFractional;
    } else {
      json[r'total_events_fractional'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.viewWindow != null) {
      json[r'view_window'] = this.viewWindow;
    } else {
      json[r'view_window'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionMSOTEventsCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionMSOTEventsCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_group_id'), 'Required key "ConversionMSOTEventsCreate[ad_group_id]" is missing from JSON.');
        assert(json[r'ad_group_id'] != null, 'Required key "ConversionMSOTEventsCreate[ad_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'event_id'), 'Required key "ConversionMSOTEventsCreate[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "ConversionMSOTEventsCreate[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'event_name'), 'Required key "ConversionMSOTEventsCreate[event_name]" is missing from JSON.');
        assert(json[r'event_name'] != null, 'Required key "ConversionMSOTEventsCreate[event_name]" has a null value in JSON.');
        assert(json.containsKey(r'event_timestamp'), 'Required key "ConversionMSOTEventsCreate[event_timestamp]" is missing from JSON.');
        assert(json[r'event_timestamp'] != null, 'Required key "ConversionMSOTEventsCreate[event_timestamp]" has a null value in JSON.');
        return true;
      }());

      return ConversionMSOTEventsCreate(
        actionTimestamps: json[r'action_timestamps'] is Iterable
            ? (json[r'action_timestamps'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        attributionModel: AttributionModel.fromJson(json[r'attribution_model']),
        attributionScope: AttributionScope.fromJson(json[r'attribution_scope']),
        attributionScore: mapValueOfType<double>(json, r'attribution_score'),
        campaignId: mapValueOfType<String>(json, r'campaign_id'),
        clickWindow: mapValueOfType<String>(json, r'click_window'),
        currency: Currency.fromJson(json[r'currency']),
        eventId: mapValueOfType<String>(json, r'event_id')!,
        eventName: MsotEventName.fromJson(json[r'event_name'])!,
        eventTimestamp: mapValueOfType<int>(json, r'event_timestamp')!,
        totalEventTouchpoints: mapValueOfType<int>(json, r'total_event_touchpoints'),
        totalEvents: mapValueOfType<int>(json, r'total_events'),
        totalEventsFractional: mapValueOfType<double>(json, r'total_events_fractional'),
        value: mapValueOfType<double>(json, r'value'),
        viewWindow: mapValueOfType<String>(json, r'view_window'),
      );
    }
    return null;
  }

  static List<ConversionMSOTEventsCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionMSOTEventsCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionMSOTEventsCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionMSOTEventsCreate> mapFromJson(dynamic json) {
    final map = <String, ConversionMSOTEventsCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionMSOTEventsCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionMSOTEventsCreate-objects as value to a dart map
  static Map<String, List<ConversionMSOTEventsCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionMSOTEventsCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionMSOTEventsCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_group_id',
    'event_id',
    'event_name',
    'event_timestamp',
  };
}

