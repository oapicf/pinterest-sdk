//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinterest_lib_status204.g.dart';

/// The resource was successfully deleted.
///
/// Properties:
/// * [statusCode] 
@BuiltValue()
abstract class PinterestLibStatus204 implements Built<PinterestLibStatus204, PinterestLibStatus204Builder> {
  @BuiltValueField(wireName: r'statusCode')
  PinterestLibStatus204StatusCodeEnum get statusCode;
  // enum statusCodeEnum {  204,  };

  PinterestLibStatus204._();

  factory PinterestLibStatus204([void updates(PinterestLibStatus204Builder b)]) = _$PinterestLibStatus204;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinterestLibStatus204Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinterestLibStatus204> get serializer => _$PinterestLibStatus204Serializer();
}

class _$PinterestLibStatus204Serializer implements PrimitiveSerializer<PinterestLibStatus204> {
  @override
  final Iterable<Type> types = const [PinterestLibStatus204, _$PinterestLibStatus204];

  @override
  final String wireName = r'PinterestLibStatus204';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinterestLibStatus204 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'statusCode';
    yield serializers.serialize(
      object.statusCode,
      specifiedType: const FullType(PinterestLibStatus204StatusCodeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinterestLibStatus204 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinterestLibStatus204Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'statusCode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinterestLibStatus204StatusCodeEnum),
          ) as PinterestLibStatus204StatusCodeEnum;
          result.statusCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinterestLibStatus204 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinterestLibStatus204Builder();
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

class PinterestLibStatus204StatusCodeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'204')
  static const PinterestLibStatus204StatusCodeEnum n204 = _$pinterestLibStatus204StatusCodeEnum_n204;

  static Serializer<PinterestLibStatus204StatusCodeEnum> get serializer => _$pinterestLibStatus204StatusCodeEnumSerializer;

  const PinterestLibStatus204StatusCodeEnum._(String name): super(name);

  static BuiltSet<PinterestLibStatus204StatusCodeEnum> get values => _$pinterestLibStatus204StatusCodeEnumValues;
  static PinterestLibStatus204StatusCodeEnum valueOf(String name) => _$pinterestLibStatus204StatusCodeEnumValueOf(name);
}

