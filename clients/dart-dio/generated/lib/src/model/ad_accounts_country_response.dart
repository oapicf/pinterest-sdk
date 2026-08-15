//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_accounts_country_response_data.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_country_response.g.dart';

/// AdAccountsCountryResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdAccountsCountryResponse implements Built<AdAccountsCountryResponse, AdAccountsCountryResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdAccountsCountryResponseData>? get items;

  AdAccountsCountryResponse._();

  factory AdAccountsCountryResponse([void updates(AdAccountsCountryResponseBuilder b)]) = _$AdAccountsCountryResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsCountryResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsCountryResponse> get serializer => _$AdAccountsCountryResponseSerializer();
}

class _$AdAccountsCountryResponseSerializer implements PrimitiveSerializer<AdAccountsCountryResponse> {
  @override
  final Iterable<Type> types = const [AdAccountsCountryResponse, _$AdAccountsCountryResponse];

  @override
  final String wireName = r'AdAccountsCountryResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsCountryResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AdAccountsCountryResponseData)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountsCountryResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsCountryResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdAccountsCountryResponseData)]),
          ) as BuiltList<AdAccountsCountryResponseData>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountsCountryResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsCountryResponseBuilder();
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

