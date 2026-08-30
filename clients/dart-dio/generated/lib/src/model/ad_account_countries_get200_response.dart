//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_accounts_country.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_countries_get200_response.g.dart';

/// AdAccountCountriesGet200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdAccountCountriesGet200Response implements Built<AdAccountCountriesGet200Response, AdAccountCountriesGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdAccountsCountry> get items;

  AdAccountCountriesGet200Response._();

  factory AdAccountCountriesGet200Response([void updates(AdAccountCountriesGet200ResponseBuilder b)]) = _$AdAccountCountriesGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountCountriesGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountCountriesGet200Response> get serializer => _$AdAccountCountriesGet200ResponseSerializer();
}

class _$AdAccountCountriesGet200ResponseSerializer implements PrimitiveSerializer<AdAccountCountriesGet200Response> {
  @override
  final Iterable<Type> types = const [AdAccountCountriesGet200Response, _$AdAccountCountriesGet200Response];

  @override
  final String wireName = r'AdAccountCountriesGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountCountriesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdAccountsCountry)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountCountriesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountCountriesGet200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdAccountsCountry)]),
          ) as BuiltList<AdAccountsCountry>;
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
  AdAccountCountriesGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountCountriesGet200ResponseBuilder();
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

