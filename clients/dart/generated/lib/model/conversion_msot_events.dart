//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionMSOTEvents {
  /// Returns a new [ConversionMSOTEvents] instance.
  ConversionMSOTEvents({
    this.actionTimestamps = const [],
    required this.adGroupId,
    this.attributionModel,
    required this.attributionScope,
    this.attributionScore,
    this.campaignId,
    this.currency,
    required this.eventId,
    required this.eventName,
    required this.eventTimestamp,
    this.totalEventTouchpoints,
    this.totalEvents,
    this.value,
  });

  /// Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  List<int> actionTimestamps;

  /// The ID of the ad group that was attributed to the conversion event.
  String adGroupId;

  /// The attribution model used to attribute the conversion event.
  ConversionMSOTEventsAttributionModelEnum? attributionModel;

  /// Ad event type.
  ConversionMSOTEventsAttributionScopeEnum attributionScope;

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
  ConversionMSOTEventsEventNameEnum eventName;

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

  /// Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
  ///
  /// Minimum value: 1
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalEvents;

  /// Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionMSOTEvents &&
    _deepEquality.equals(other.actionTimestamps, actionTimestamps) &&
    other.adGroupId == adGroupId &&
    other.attributionModel == attributionModel &&
    other.attributionScope == attributionScope &&
    other.attributionScore == attributionScore &&
    other.campaignId == campaignId &&
    other.currency == currency &&
    other.eventId == eventId &&
    other.eventName == eventName &&
    other.eventTimestamp == eventTimestamp &&
    other.totalEventTouchpoints == totalEventTouchpoints &&
    other.totalEvents == totalEvents &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (actionTimestamps.hashCode) +
    (adGroupId.hashCode) +
    (attributionModel == null ? 0 : attributionModel!.hashCode) +
    (attributionScope.hashCode) +
    (attributionScore == null ? 0 : attributionScore!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (eventId.hashCode) +
    (eventName.hashCode) +
    (eventTimestamp.hashCode) +
    (totalEventTouchpoints == null ? 0 : totalEventTouchpoints!.hashCode) +
    (totalEvents == null ? 0 : totalEvents!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'ConversionMSOTEvents[actionTimestamps=$actionTimestamps, adGroupId=$adGroupId, attributionModel=$attributionModel, attributionScope=$attributionScope, attributionScore=$attributionScore, campaignId=$campaignId, currency=$currency, eventId=$eventId, eventName=$eventName, eventTimestamp=$eventTimestamp, totalEventTouchpoints=$totalEventTouchpoints, totalEvents=$totalEvents, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'action_timestamps'] = this.actionTimestamps;
      json[r'ad_group_id'] = this.adGroupId;
    if (this.attributionModel != null) {
      json[r'attribution_model'] = this.attributionModel;
    } else {
      json[r'attribution_model'] = null;
    }
      json[r'attribution_scope'] = this.attributionScope;
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
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionMSOTEvents] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionMSOTEvents? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionMSOTEvents[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionMSOTEvents[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionMSOTEvents(
        actionTimestamps: json[r'action_timestamps'] is Iterable
            ? (json[r'action_timestamps'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        attributionModel: ConversionMSOTEventsAttributionModelEnum.fromJson(json[r'attribution_model']),
        attributionScope: ConversionMSOTEventsAttributionScopeEnum.fromJson(json[r'attribution_scope'])!,
        attributionScore: mapValueOfType<double>(json, r'attribution_score'),
        campaignId: mapValueOfType<String>(json, r'campaign_id'),
        currency: Currency.fromJson(json[r'currency']),
        eventId: mapValueOfType<String>(json, r'event_id')!,
        eventName: ConversionMSOTEventsEventNameEnum.fromJson(json[r'event_name'])!,
        eventTimestamp: mapValueOfType<int>(json, r'event_timestamp')!,
        totalEventTouchpoints: mapValueOfType<int>(json, r'total_event_touchpoints'),
        totalEvents: mapValueOfType<int>(json, r'total_events'),
        value: mapValueOfType<double>(json, r'value'),
      );
    }
    return null;
  }

  static List<ConversionMSOTEvents> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionMSOTEvents>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionMSOTEvents.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionMSOTEvents> mapFromJson(dynamic json) {
    final map = <String, ConversionMSOTEvents>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionMSOTEvents.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionMSOTEvents-objects as value to a dart map
  static Map<String, List<ConversionMSOTEvents>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionMSOTEvents>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionMSOTEvents.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_group_id',
    'attribution_scope',
    'event_id',
    'event_name',
    'event_timestamp',
  };
}

/// The attribution model used to attribute the conversion event.
class ConversionMSOTEventsAttributionModelEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionMSOTEventsAttributionModelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const firstTouch = ConversionMSOTEventsAttributionModelEnum._(r'first_touch');
  static const lastTouch = ConversionMSOTEventsAttributionModelEnum._(r'last_touch');
  static const multiTouch = ConversionMSOTEventsAttributionModelEnum._(r'multi_touch');

  /// List of all possible values in this [enum][ConversionMSOTEventsAttributionModelEnum].
  static const values = <ConversionMSOTEventsAttributionModelEnum>[
    firstTouch,
    lastTouch,
    multiTouch,
  ];

  static ConversionMSOTEventsAttributionModelEnum? fromJson(dynamic value) => ConversionMSOTEventsAttributionModelEnumTypeTransformer().decode(value);

  static List<ConversionMSOTEventsAttributionModelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionMSOTEventsAttributionModelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionMSOTEventsAttributionModelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionMSOTEventsAttributionModelEnum] to String,
/// and [decode] dynamic data back to [ConversionMSOTEventsAttributionModelEnum].
class ConversionMSOTEventsAttributionModelEnumTypeTransformer {
  factory ConversionMSOTEventsAttributionModelEnumTypeTransformer() => _instance ??= const ConversionMSOTEventsAttributionModelEnumTypeTransformer._();

  const ConversionMSOTEventsAttributionModelEnumTypeTransformer._();

  String encode(ConversionMSOTEventsAttributionModelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionMSOTEventsAttributionModelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionMSOTEventsAttributionModelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'first_touch': return ConversionMSOTEventsAttributionModelEnum.firstTouch;
        case r'last_touch': return ConversionMSOTEventsAttributionModelEnum.lastTouch;
        case r'multi_touch': return ConversionMSOTEventsAttributionModelEnum.multiTouch;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionMSOTEventsAttributionModelEnumTypeTransformer] instance.
  static ConversionMSOTEventsAttributionModelEnumTypeTransformer? _instance;
}


/// Ad event type.
class ConversionMSOTEventsAttributionScopeEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionMSOTEventsAttributionScopeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const view = ConversionMSOTEventsAttributionScopeEnum._(r'view');
  static const engagement = ConversionMSOTEventsAttributionScopeEnum._(r'engagement');
  static const click = ConversionMSOTEventsAttributionScopeEnum._(r'click');

  /// List of all possible values in this [enum][ConversionMSOTEventsAttributionScopeEnum].
  static const values = <ConversionMSOTEventsAttributionScopeEnum>[
    view,
    engagement,
    click,
  ];

  static ConversionMSOTEventsAttributionScopeEnum? fromJson(dynamic value) => ConversionMSOTEventsAttributionScopeEnumTypeTransformer().decode(value);

  static List<ConversionMSOTEventsAttributionScopeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionMSOTEventsAttributionScopeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionMSOTEventsAttributionScopeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionMSOTEventsAttributionScopeEnum] to String,
/// and [decode] dynamic data back to [ConversionMSOTEventsAttributionScopeEnum].
class ConversionMSOTEventsAttributionScopeEnumTypeTransformer {
  factory ConversionMSOTEventsAttributionScopeEnumTypeTransformer() => _instance ??= const ConversionMSOTEventsAttributionScopeEnumTypeTransformer._();

  const ConversionMSOTEventsAttributionScopeEnumTypeTransformer._();

  String encode(ConversionMSOTEventsAttributionScopeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionMSOTEventsAttributionScopeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionMSOTEventsAttributionScopeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'view': return ConversionMSOTEventsAttributionScopeEnum.view;
        case r'engagement': return ConversionMSOTEventsAttributionScopeEnum.engagement;
        case r'click': return ConversionMSOTEventsAttributionScopeEnum.click;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionMSOTEventsAttributionScopeEnumTypeTransformer] instance.
  static ConversionMSOTEventsAttributionScopeEnumTypeTransformer? _instance;
}


/// Type of user event.
class ConversionMSOTEventsEventNameEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionMSOTEventsEventNameEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const addToCart = ConversionMSOTEventsEventNameEnum._(r'add_to_cart');
  static const checkout = ConversionMSOTEventsEventNameEnum._(r'checkout');
  static const lead = ConversionMSOTEventsEventNameEnum._(r'lead');
  static const signup = ConversionMSOTEventsEventNameEnum._(r'signup');

  /// List of all possible values in this [enum][ConversionMSOTEventsEventNameEnum].
  static const values = <ConversionMSOTEventsEventNameEnum>[
    addToCart,
    checkout,
    lead,
    signup,
  ];

  static ConversionMSOTEventsEventNameEnum? fromJson(dynamic value) => ConversionMSOTEventsEventNameEnumTypeTransformer().decode(value);

  static List<ConversionMSOTEventsEventNameEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionMSOTEventsEventNameEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionMSOTEventsEventNameEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionMSOTEventsEventNameEnum] to String,
/// and [decode] dynamic data back to [ConversionMSOTEventsEventNameEnum].
class ConversionMSOTEventsEventNameEnumTypeTransformer {
  factory ConversionMSOTEventsEventNameEnumTypeTransformer() => _instance ??= const ConversionMSOTEventsEventNameEnumTypeTransformer._();

  const ConversionMSOTEventsEventNameEnumTypeTransformer._();

  String encode(ConversionMSOTEventsEventNameEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionMSOTEventsEventNameEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionMSOTEventsEventNameEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'add_to_cart': return ConversionMSOTEventsEventNameEnum.addToCart;
        case r'checkout': return ConversionMSOTEventsEventNameEnum.checkout;
        case r'lead': return ConversionMSOTEventsEventNameEnum.lead;
        case r'signup': return ConversionMSOTEventsEventNameEnum.signup;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionMSOTEventsEventNameEnumTypeTransformer] instance.
  static ConversionMSOTEventsEventNameEnumTypeTransformer? _instance;
}


