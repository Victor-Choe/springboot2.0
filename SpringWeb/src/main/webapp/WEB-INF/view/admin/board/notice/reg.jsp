<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <main>
                <h2 class="main title">�������� ���</h2>

                <div class="breadcrumb">
                    <h3 class="hidden">breadlet</h3>
                    <ul>
                        <li>home</li>
                        <li>�Խñ� ����</li>
                        <li>��������</li>
                    </ul>
                </div>

                <form method="post" enctype="multipart/form-data">
                    <div class="margin-top first">
                        <h3 class="hidden">�������� �Է�</h3>
                        <table class="table">
                            <tbody>
                                <tr>
                                    <th>����</th>
                                    <td class="text-align-left text-indent text-strong text-orange" colspan="3">
                                        <input type="text" name="title" />
                                    </td>
                                </tr>
                                <tr>
                                    <th>÷������</th>
                                    <td colspan="3" class="text-align-left text-indent"><input type="file"
                                            name="file" /> </td>
                                </tr>
                                <tr class="content">
                                    <td colspan="4"><textarea class="content" name="content"></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="4" class="text-align-right"><input class="vertical-align" type="checkbox" id="open" name="open" value="true"><label for="open" class="margin-left">�ٷΰ���</label> </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="margin-top text-align-center">
                        <input class="btn-text btn-default" type="submit" value="���" />
                        <a class="btn-text btn-cancel" href="list.html">���</a>
                    </div>
                </form>

            </main>