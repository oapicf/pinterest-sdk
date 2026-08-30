//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'event_processing_status.g.dart';

class EventProcessingStatus extends EnumClass {

  /// Status of a single event in the response.
  @BuiltValueEnumConst(wireName: r'failed')
  static const EventProcessingStatus failed = _$failed;
  /// Status of a single event in the response.
  @BuiltValueEnumConst(wireName: r'processed')
  static const EventProcessingStatus processed = _$processed;

  static Serializer<EventProcessingStatus> get serializer => _$eventProcessingStatusSerializer;

  const EventProcessingStatus._(String name): super(name);

  static BuiltSet<EventProcessingStatus> get values => _$values;
  static EventProcessingStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class EventProcessingStatusMixin = Object with _$EventProcessingStatusMixin;

