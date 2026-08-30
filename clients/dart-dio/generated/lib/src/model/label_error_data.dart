//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nullable_label_status.dart';
import 'package:openapi/src/model/nullable_label_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_error_data.g.dart';

/// LabelErrorData
///
/// Properties:
/// * [id] - Label ID.
/// * [labelType] 
/// * [status] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class LabelErrorData implements Built<LabelErrorData, LabelErrorDataBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'label_type')
  NullableLabelType? get labelType;
  // enum labelTypeEnum {  BRAND,  CUSTOM,  ,  };

  @BuiltValueField(wireName: r'status')
  NullableLabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  ,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String? get value;

  LabelErrorData._();

  factory LabelErrorData([void updates(LabelErrorDataBuilder b)]) = _$LabelErrorData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelErrorDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelErrorData> get serializer => _$LabelErrorDataSerializer();
}

class _$LabelErrorDataSerializer implements PrimitiveSerializer<LabelErrorData> {
  @override
  final Iterable<Type> types = const [LabelErrorData, _$LabelErrorData];

  @override
  final String wireName = r'LabelErrorData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelErrorData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.labelType != null) {
      yield r'label_type';
      yield serializers.serialize(
        object.labelType,
        specifiedType: const FullType.nullable(NullableLabelType),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType.nullable(NullableLabelStatus),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelErrorData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelErrorDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'label_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableLabelType),
          ) as NullableLabelType?;
          if (valueDes == null) continue;
          result.labelType = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableLabelStatus),
          ) as NullableLabelStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelErrorData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelErrorDataBuilder();
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

