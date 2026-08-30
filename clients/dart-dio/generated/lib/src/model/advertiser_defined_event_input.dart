//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/advertiser_defined_event_mapping_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_event_input.g.dart';

/// Advertiser defined event input for create/update operations
///
/// Properties:
/// * [mappedConversionType] - Pinterest standard event type to map this custom event to for campaign optimization and reporting
/// * [name] - Raw string name of the event
@BuiltValue()
abstract class AdvertiserDefinedEventInput implements Built<AdvertiserDefinedEventInput, AdvertiserDefinedEventInputBuilder> {
  /// Pinterest standard event type to map this custom event to for campaign optimization and reporting
  @BuiltValueField(wireName: r'mapped_conversion_type')
  AdvertiserDefinedEventMappingType get mappedConversionType;
  // enum mappedConversionTypeEnum {  SIGNUP,  ADD_TO_CART,  LEAD,  CHECKOUT,  SUBSCRIBE,  ADD_TO_WISHLIST,  ADD_PAYMENT_INFO,  INITIATE_CHECKOUT,  CONTACT,  CUSTOMIZE_PRODUCT,  FIND_LOCATION,  SCHEDULE,  SUBMIT_APPLICATION,  START_TRIAL,  PAGE_VISIT,  VIEW_CATEGORY,  VIEW_CONTENT,  SEARCH,  WATCH_VIDEO,  };

  /// Raw string name of the event
  @BuiltValueField(wireName: r'name')
  String get name;

  AdvertiserDefinedEventInput._();

  factory AdvertiserDefinedEventInput([void updates(AdvertiserDefinedEventInputBuilder b)]) = _$AdvertiserDefinedEventInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventInput> get serializer => _$AdvertiserDefinedEventInputSerializer();
}

class _$AdvertiserDefinedEventInputSerializer implements PrimitiveSerializer<AdvertiserDefinedEventInput> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventInput, _$AdvertiserDefinedEventInput];

  @override
  final String wireName = r'AdvertiserDefinedEventInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'mapped_conversion_type';
    yield serializers.serialize(
      object.mappedConversionType,
      specifiedType: const FullType(AdvertiserDefinedEventMappingType),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventInputBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mapped_conversion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdvertiserDefinedEventMappingType),
          ) as AdvertiserDefinedEventMappingType;
          result.mappedConversionType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvertiserDefinedEventInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventInputBuilder();
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

