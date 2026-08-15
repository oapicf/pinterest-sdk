//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_mmm_report_response_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_mmm_report_response.g.dart';

/// CreateMMMReportResponse
///
/// Properties:
/// * [code] 
/// * [data] 
@BuiltValue()
abstract class CreateMMMReportResponse implements Built<CreateMMMReportResponse, CreateMMMReportResponseBuilder> {
  @BuiltValueField(wireName: r'code')
  num? get code;

  @BuiltValueField(wireName: r'data')
  CreateMMMReportResponseData? get data;

  CreateMMMReportResponse._();

  factory CreateMMMReportResponse([void updates(CreateMMMReportResponseBuilder b)]) = _$CreateMMMReportResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMMMReportResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMMMReportResponse> get serializer => _$CreateMMMReportResponseSerializer();
}

class _$CreateMMMReportResponseSerializer implements PrimitiveSerializer<CreateMMMReportResponse> {
  @override
  final Iterable<Type> types = const [CreateMMMReportResponse, _$CreateMMMReportResponse];

  @override
  final String wireName = r'CreateMMMReportResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMMMReportResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(num),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(CreateMMMReportResponseData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMMMReportResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateMMMReportResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.code = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateMMMReportResponseData),
          ) as CreateMMMReportResponseData;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateMMMReportResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMMMReportResponseBuilder();
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

