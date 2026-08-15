//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_event.g.dart';

/// AdvertiserDefinedEvent
///
/// Properties:
/// * [name] - raw string name of the event, usually logged as raw_event_name in our dataset
/// * [mappedConversionType] - standard type mapped to ADE for optimization
@BuiltValue()
abstract class AdvertiserDefinedEvent implements Built<AdvertiserDefinedEvent, AdvertiserDefinedEventBuilder> {
  /// raw string name of the event, usually logged as raw_event_name in our dataset
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// standard type mapped to ADE for optimization
  @BuiltValueField(wireName: r'mapped_conversion_type')
  MappedConversionTypeEnum? get mappedConversionType;
  // enum mappedConversionTypeEnum {  PAGE_LOAD,  UNKNOWN,  INITIALIZED,  PAGE_VISIT,  SIGNUP,  CHECKOUT,  CUSTOM,  VIEW_CATEGORY,  SEARCH,  ADD_TO_CART,  WATCH_VIDEO,  LEAD,  APP_INSTALL,  WEB_SESSION,  EXTERNAL_MEASUREMENT,  ADD_PAYMENT_INFO,  ADD_TO_WISHLIST,  INITIATE_CHECKOUT,  SUBSCRIBE,  VIEW_CONTENT,  ADVERTISER_DEFINED_EVENT,  APP_OPEN,  CONTACT,  SCHEDULE,  FIND_LOCATION,  CUSTOMIZE_PRODUCT,  SUBMIT_APPLICATION,  START_TRIAL,  ,  };

  AdvertiserDefinedEvent._();

  factory AdvertiserDefinedEvent([void updates(AdvertiserDefinedEventBuilder b)]) = _$AdvertiserDefinedEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEvent> get serializer => _$AdvertiserDefinedEventSerializer();
}

class _$AdvertiserDefinedEventSerializer implements PrimitiveSerializer<AdvertiserDefinedEvent> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEvent, _$AdvertiserDefinedEvent];

  @override
  final String wireName = r'AdvertiserDefinedEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.mappedConversionType != null) {
      yield r'mapped_conversion_type';
      yield serializers.serialize(
        object.mappedConversionType,
        specifiedType: const FullType.nullable(MappedConversionTypeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'mapped_conversion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MappedConversionTypeEnum),
          ) as MappedConversionTypeEnum?;
          if (valueDes == null) continue;
          result.mappedConversionType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvertiserDefinedEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventBuilder();
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

