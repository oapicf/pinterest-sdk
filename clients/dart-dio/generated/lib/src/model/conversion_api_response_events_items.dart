//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/event_processing_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_api_response_events_items.g.dart';

/// ConversionApiResponseEventsItems
///
/// Properties:
/// * [errorMessage] - Error message containing more information about why the event failed to be processed.
/// * [status] - Whether the event was processed successfully.
/// * [warningMessage] - Warning messages about any fields in the event which are not standard. These are not critical to event processing.
@BuiltValue()
abstract class ConversionApiResponseEventsItems implements Built<ConversionApiResponseEventsItems, ConversionApiResponseEventsItemsBuilder> {
  /// Error message containing more information about why the event failed to be processed.
  @BuiltValueField(wireName: r'error_message')
  String? get errorMessage;

  /// Whether the event was processed successfully.
  @BuiltValueField(wireName: r'status')
  EventProcessingStatus get status;
  // enum statusEnum {  failed,  processed,  };

  /// Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  @BuiltValueField(wireName: r'warning_message')
  String? get warningMessage;

  ConversionApiResponseEventsItems._();

  factory ConversionApiResponseEventsItems([void updates(ConversionApiResponseEventsItemsBuilder b)]) = _$ConversionApiResponseEventsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionApiResponseEventsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionApiResponseEventsItems> get serializer => _$ConversionApiResponseEventsItemsSerializer();
}

class _$ConversionApiResponseEventsItemsSerializer implements PrimitiveSerializer<ConversionApiResponseEventsItems> {
  @override
  final Iterable<Type> types = const [ConversionApiResponseEventsItems, _$ConversionApiResponseEventsItems];

  @override
  final String wireName = r'ConversionApiResponseEventsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionApiResponseEventsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errorMessage != null) {
      yield r'error_message';
      yield serializers.serialize(
        object.errorMessage,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(EventProcessingStatus),
    );
    if (object.warningMessage != null) {
      yield r'warning_message';
      yield serializers.serialize(
        object.warningMessage,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionApiResponseEventsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionApiResponseEventsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'error_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.errorMessage = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EventProcessingStatus),
          ) as EventProcessingStatus;
          result.status = valueDes;
          break;
        case r'warning_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.warningMessage = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionApiResponseEventsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionApiResponseEventsItemsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

