//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/get_mmm_report_response_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_mmm_report_response.g.dart';

/// GetMMMReportResponse
///
/// Properties:
/// * [code] 
/// * [data] 
/// * [message] 
/// * [status] 
@BuiltValue()
abstract class GetMMMReportResponse implements Built<GetMMMReportResponse, GetMMMReportResponseBuilder> {
  @BuiltValueField(wireName: r'code')
  num? get code;

  @BuiltValueField(wireName: r'data')
  GetMMMReportResponseData? get data;

  @BuiltValueField(wireName: r'message')
  String? get message;

  @BuiltValueField(wireName: r'status')
  String? get status;

  GetMMMReportResponse._();

  factory GetMMMReportResponse([void updates(GetMMMReportResponseBuilder b)]) = _$GetMMMReportResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetMMMReportResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetMMMReportResponse> get serializer => _$GetMMMReportResponseSerializer();
}

class _$GetMMMReportResponseSerializer implements PrimitiveSerializer<GetMMMReportResponse> {
  @override
  final Iterable<Type> types = const [GetMMMReportResponse, _$GetMMMReportResponse];

  @override
  final String wireName = r'GetMMMReportResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetMMMReportResponse object, {
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
        specifiedType: const FullType(GetMMMReportResponseData),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GetMMMReportResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetMMMReportResponseBuilder result,
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
            specifiedType: const FullType(GetMMMReportResponseData),
          ) as GetMMMReportResponseData;
          result.data.replace(valueDes);
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GetMMMReportResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetMMMReportResponseBuilder();
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

